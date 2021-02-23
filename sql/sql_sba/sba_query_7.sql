SELECT *
FROM studentcourse
LEFT JOIN course ON studentcourse.courseId = course.id
LEFT JOIN student ON student.id = studentcourse.studentId
WHERE student.majorId = course.deptId;