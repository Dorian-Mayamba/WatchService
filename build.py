import subprocess
user="dorian"
password="dorian01"
create_role = f"CREATE ROLE {user} ENCRYPTED PASSWORD '{password}'"
subprocess.call(f'psql -U postgres -c "{create_role}"',shell=True)
create_db = f'CREATE DATABASE watch_service OWNER {user}'
subprocess.call(f'psql -U postgres -c "{create_db}"', shell=True)
grant_all_privileges_tables=f"GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public to {user};"
grant_all_privileges_sequences=f"GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public to {user};"
subprocess.call(f'psql -U postgres -c "{grant_all_privileges_tables}"', shell=True)
subprocess.call(f'psql -U postgres -c "{grant_all_privileges_sequences}"',shell=True)



