import pandas as pd

def actors_and_directors(actor_director: pd.DataFrame) -> pd.DataFrame:
    
    result = actor_director.groupby(['actor_id', 'director_id']).size().reset_index(name='cooperation_count')
    
    
    result = result[result['cooperation_count'] >= 3]
    
    
    return result[['actor_id', 'director_id']]
