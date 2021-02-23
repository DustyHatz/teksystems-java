SELECT
student.firstname AS First_Name,
student.lastname AS Last_Name,
COUNT(studentcourse.studentId) AS Number_of_Courses
FROM studentcourse
LEFT JOIN course ON studentcourse.courseId = course.id
LEFT JOIN student ON student.id = studentcourse.studentId
WHERE student.majorId = course.deptId
GROUP BY studentcourse.studentId
ORDER BY Number_of_Courses DESC, First_Name, Last_Name;