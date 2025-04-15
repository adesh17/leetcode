import pandas as pd

def second_highest_salary(employee: pd.DataFrame) -> pd.DataFrame:
   
    distinct_salaries = employee['salary'].drop_duplicates().sort_values(ascending=False)
    
    
    if len(distinct_salaries) < 2:
        return pd.DataFrame([[None]], columns=['SecondHighestSalary'])
    
    
    second_highest = distinct_salaries.iloc[1]
    return pd.DataFrame([[second_highest]], columns=['SecondHighestSalary'])
