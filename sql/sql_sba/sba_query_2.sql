SELECT
	course.name AS Course_Name,
    count(studentcourse.studentId) AS Number_of_Students
FROM
	course
JOIN
	studentcourse ON course.id = studentcourse.courseId
GROUP BY
	Course_Name
ORDER BY 
	Number_of_Students DESC,
	Course_Name;
    