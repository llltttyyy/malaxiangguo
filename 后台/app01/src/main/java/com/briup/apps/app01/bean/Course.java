package com.briup.apps.app01.bean;

public class Course {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_course.id
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_course.name
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_course.description
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_course.credit
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    private Double credit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_course.teacher_id
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    private Long teacherId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_course.id
     *
     * @return the value of c_course.id
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_course.id
     *
     * @param id the value for c_course.id
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_course.name
     *
     * @return the value of c_course.name
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_course.name
     *
     * @param name the value for c_course.name
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_course.description
     *
     * @return the value of c_course.description
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_course.description
     *
     * @param description the value for c_course.description
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_course.credit
     *
     * @return the value of c_course.credit
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    public Double getCredit() {
        return credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_course.credit
     *
     * @param credit the value for c_course.credit
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    public void setCredit(Double credit) {
        this.credit = credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_course.teacher_id
     *
     * @return the value of c_course.teacher_id
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_course.teacher_id
     *
     * @param teacherId the value for c_course.teacher_id
     *
     * @mbg.generated Thu May 02 19:08:13 CST 2019
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}