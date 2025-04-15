import pandas as pd

def delete_duplicate_emails(person: pd.DataFrame) -> None:
    # Sort by id so the smallest id comes first
    person.sort_values(by='id', inplace=True)
    # Drop duplicates based on email, keeping the first (i.e., smallest id)
    person.drop_duplicates(subset='email', keep='first', inplace=True)
    # Reset the index if needed (optional, depends on system requirement)
    person.reset_index(drop=True, inplace=True)
