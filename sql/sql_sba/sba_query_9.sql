SELECT 
  course.name AS Course_Name, 
  ROUND(
    AVG(studentcourse.progress), 
    1
  ) AS Average_Progress 
FROM 
  studentcourse 
  JOIN course ON studentcourse.courseId = course.id 
GROUP BY 
  studentcourse.courseId 
ORDER BY 
  Average_Progress DESC, 
  Course_Name;
