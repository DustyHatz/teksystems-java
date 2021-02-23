SELECT 
  faculty.firstname AS First_Name, 
  faculty.lastname AS Last_Name, 
  ROUND(
    AVG(studentcourse.progress), 
    1
  ) AS Average_Progress 
FROM 
  facultycourse 
  JOIN studentcourse ON facultycourse.courseId = studentcourse.courseId 
  JOIN faculty ON facultycourse.facultyId = faculty.id 
GROUP BY 
  faculty.id 
ORDER BY 
  Average_Progress DESC, 
  First_Name, 
  Last_Name;
