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
HAVING 
  ROUND(
    AVG(studentcourse.progress), 
    1
  ) >.9 * (
    SELECT 
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
      Average_Progress DESC 
    LIMIT 
      1
  ) 
ORDER BY 
  Average_Progress DESC, 
  First_Name, 
  Last_Name;
