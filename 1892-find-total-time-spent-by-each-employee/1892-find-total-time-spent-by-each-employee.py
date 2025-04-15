import pandas as pd

def total_time(employees: pd.DataFrame) -> pd.DataFrame:
    
    employees['total_time'] = employees['out_time'] - employees['in_time']
    

    result = employees.groupby(['event_day', 'emp_id'], as_index=False)['total_time'].sum()
    
    
    result = result.rename(columns={'event_day': 'day'})
    
    
    result = result.sort_values(by=['day', 'emp_id'], ascending=[True, True])
    
    return result
