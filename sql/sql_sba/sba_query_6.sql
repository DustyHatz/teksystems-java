SELECT 
  studentcourse.startDate AS Start_Date, 
  COUNT(
    DISTINCT studentcourse.studentId
  ) AS Total_Number_of_Students 
FROM 
  studentcourse 
WHERE 
  MONTH(studentcourse.startDate) = 08 
GROUP BY 
  Start_Date 
ORDER BY 
  Start_Date, 
  Total_Number_of_Students;
