import pandas as pd

def department_highest_salary(employee: pd.DataFrame, department: pd.DataFrame) -> pd.DataFrame:
   
    merged_data = pd.merge(employee, department, left_on='departmentId', right_on='id', how='inner')
    
    
    highest_salary_per_dept = merged_data.groupby('departmentId')['salary'].max().reset_index()
    highest_salary_per_dept.rename(columns={'salary': 'max_salary'}, inplace=True)
    
    
    result = pd.merge(merged_data, highest_salary_per_dept, left_on='departmentId', right_on='departmentId')
    
    
    result = result[result['salary'] == result['max_salary']]
    
    
    result = result[['name_x', 'name_y', 'salary']]
    
    
    result.columns = ['Employee', 'Department', 'Salary']
    
    return result
