SELECT 
    department.name AS Department_Name,
    COUNT(course.deptId) AS Number_of_Courses
FROM
    course
JOIN
    department ON department.id = course.deptId
GROUP BY 
	department.name
ORDER BY 
	Number_of_Courses,
    Department_Name;