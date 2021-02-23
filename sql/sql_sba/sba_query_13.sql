SELECT 
  student.firstname AS First_Name, 
  student.lastname AS Last_Name, 
  CASE 
	  WHEN MIN(studentcourse.progress) < 40 THEN 'F'
	  WHEN MIN(studentcourse.progress) < 50 THEN 'D'
	  WHEN MIN(studentcourse.progress) < 60 THEN 'C'
	  WHEN MIN(studentcourse.progress) < 70 THEN 'B'
	  WHEN MIN(studentcourse.progress) >= 70 THEN 'A'
  END AS Minimum_Grade, 
  CASE 
	  WHEN MAX(studentcourse.progress) < 40 THEN 'F'
      WHEN MAX(studentcourse.progress) < 50 THEN 'D'
      WHEN MAX(studentcourse.progress) < 60 THEN 'C'
      WHEN MAX(studentcourse.progress) < 70 THEN 'B'
      WHEN MAX(studentcourse.progress) >= 70 THEN 'A'
  END AS Maximum_Grade 
FROM 
  student 
  JOIN studentcourse ON student.id = studentcourse.studentId 
GROUP BY 
  studentcourse.studentId 
ORDER BY 
  Minimum_Grade DESC, 
  Maximum_Grade DESC, 
  First_Name, 
  Last_Name;
