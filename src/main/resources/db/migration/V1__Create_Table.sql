CREATE TABLE IF NOT EXISTS watches (
                         id SERIAL PRIMARY KEY,
                         user_id INT NOT NULL,
                         movie_id INT NOT NULL,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);