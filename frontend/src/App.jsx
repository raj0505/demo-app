import { useEffect, useState } from 'react'
import './App.css'

const BASE_API_URL =
  import.meta.env.VITE_API_URL ||
  (window.location.hostname === 'localhost' ? 'http://localhost:8080/api' : '/api')

function App() {
  const [profile, setProfile] = useState(null)
  const [loading, setLoading] = useState(true)
  const [error, setError] = useState('')

  useEffect(() => {
    const fetchProfile = async () => {
      try {
        const response = await fetch(`${BASE_API_URL}/profile`)
        if (!response.ok) {
          throw new Error('Unable to load profile data')
        }
        const data = await response.json()
        setProfile(data)
      } catch (err) {
        setError(err.message || 'Something went wrong while fetching the profile.')
      } finally {
        setLoading(false)
      }
    }

    fetchProfile()
  }, [])

  if (loading) {
    return <div className="page-shell"><div className="loading-card">Loading profile...</div></div>
  }

  if (error) {
    return <div className="page-shell"><div className="error-card">{error}</div></div>
  }

  return (
    <div className="page-shell">
      <header className="hero-section">
        <div className="hero-topbar">
          <span className="chip">Open to production support & backend engineering</span>
        </div>
        <div className="hero-grid">
          <div>
            <p className="eyebrow">Portfolio Profile</p>
            <h1>{profile.name}</h1>
            <h2>{profile.title}</h2>
            <div className="contact-row">
              <span>{profile.phone}</span>
              <span>{profile.email}</span>
            </div>
            <div className="contact-row">
              <a href={`https://${profile.linkedin}`} target="_blank" rel="noreferrer">{profile.linkedin}</a>
            </div>
          </div>
          <div className="profile-card">
            <div className="avatar">RK</div>
            <div className="profile-summary">
              <h3>Professional Summary</h3>
              <p>{profile.summary}</p>
            </div>
          </div>
        </div>
      </header>

      <main className="content-grid">
        <section className="panel">
          <h3>Core Strengths</h3>
          <ul className="tags">
            {profile.strengths.map((item) => (
              <li key={item}>{item}</li>
            ))}
          </ul>
        </section>

        <section className="panel">
          <h3>Technical Skills</h3>
          <ul className="bullet-list">
            {profile.skills.map((skill) => (
              <li key={skill}>{skill}</li>
            ))}
          </ul>
        </section>

        <section className="panel wide-panel">
          <h3>Professional Experience</h3>
          {profile.experience.map((job) => (
            <article key={`${job.company}-${job.role}`} className="experience-item">
              <div className="experience-header">
                <div>
                  <h4>{job.role}</h4>
                  <p>{job.company}</p>
                </div>
                <span>{job.period}</span>
              </div>
              <p className="location">{job.location}</p>
              <ul>
                {job.responsibilities.map((item) => (
                  <li key={item}>{item}</li>
                ))}
              </ul>
            </article>
          ))}
        </section>

        <section className="panel wide-panel">
          <h3>Education</h3>
          {profile.education.map((edu) => (
            <div key={`${edu.institution}-${edu.period}`} className="education-item">
              <div className="education-head">
                <div>
                  <h4>{edu.institution}</h4>
                  <p>{edu.degree}</p>
                </div>
                <span>{edu.period}</span>
              </div>
              <p className="location">{edu.location}</p>
              <p>{edu.details}</p>
            </div>
          ))}
        </section>

        <section className="panel">
          <h3>Highlights</h3>
          <ul className="bullet-list">
            {profile.achievements.map((item) => (
              <li key={item.label}><strong>{item.label}:</strong> {item.value}</li>
            ))}
          </ul>
        </section>
      </main>
    </div>
  )
}

export default App
