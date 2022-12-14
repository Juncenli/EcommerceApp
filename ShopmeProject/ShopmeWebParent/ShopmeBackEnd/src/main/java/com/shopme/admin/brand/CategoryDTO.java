package com.shopme.admin.brand;

/*
    Data Transfer Objects (DTOs) in Java are objects that transport data between subsystems.
    It is an enterprise design pattern to aggregate data.
    The main purpose is to reduce the number of system calls needed between the subsystems, reducing the amount of overhead created.


    Q: For what purpose are we using the DTO class? What advantages does this give us?
       For example, the public List <CategoryDTO> listCategoriesByBrand method of the BrandRestController class returns a List <CategoryDTO>. But why can't we use Category from the entity folder?

    A: Because entity objects are generated by Hibernate, which can be heavyweight and contains many details.
       The data transferred between the webservice on the server side and the client side (browser) should be as minimum as possible.
       So we use DTOs to limit what information needs to transferred, not all details of entities.

       So think DTO is a small part or subset of data.
 */
public class CategoryDTO {
    private Integer id;
    private String name;

    public CategoryDTO() {
    }

    public CategoryDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}