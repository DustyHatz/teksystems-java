SELECT 
  student.firstname AS First_Name, 
  student.lastname AS Last_Name, 
  ROUND(
    AVG(studentcourse.progress), 
    1
  ) AS Average_Progress 
FROM 
  studentcourse 
  JOIN student ON studentcourse.studentId = student.id 
GROUP BY 
  studentcourse.studentId 
HAVING 
  AVERAGE_PROGRESS < 50 
ORDER BY 
  Average_Progress DESC, 
  First_Name, 
  Last_Name;
