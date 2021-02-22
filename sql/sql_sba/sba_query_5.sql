SELECT 
  COUNT(
    DISTINCT studentcourse.studentId
  ) AS Students, 
  YEAR(studentcourse.startDate) AS Year 
FROM 
  studentcourse 
GROUP BY 
  Year 
ORDER BY 
  Year, 
  Students DESC;
