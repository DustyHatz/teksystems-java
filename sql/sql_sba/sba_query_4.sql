SELECT 
  course.name AS Course_Name, 
  COUNT(studentcourse.studentId) AS Number_of_Students 
FROM 
  studentcourse 
  JOIN course ON studentcourse.courseId = course.id 
  LEFT JOIN facultycourse ON course.id = facultycourse.courseId 
WHERE 
  facultycourse.courseId IS NULL 
GROUP BY 
  Course_Name 
ORDER BY 
  Number_of_Students DESC, 
  Course_Name;
