package pl.edu.vistula.firstrestapispringapplication.product.api.response;
public class ProductResponse {
    public final Long id;
    private final String name;
    public ProductResponse (Long id, String name) {
        this.id = id;
        this.name = name;
    }
public String getName() { return name; }
}
