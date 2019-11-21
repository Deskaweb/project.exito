import model.GetProductResponse;
import model.GetProductosResponse;
import org.testng.annotations.Test;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;

public class AyudaPablin {

    @Test
    public void sarasa(){
        RestTemplate restTemplate = new RestTemplate();
        String VALOR_A_BUSCAR = "Stanley";
        String url = "https://api.mercadolibre.com/sites/MLA/search?q=";


        GetProductosResponse getProductosResponse = restTemplate.getForObject(url + VALOR_A_BUSCAR, GetProductosResponse.class);

        System.out.println(getProductosResponse.getResults().get(10).getTitle());
        //Obtengo la cantidad total de productos
        System.out.println("Cantidad de productos obtenidos: " + getProductosResponse.getPaging().getTotal());
        //Verifico si la cantidad obtenida no rompe el paginado
        Assert.assertEquals(getProductosResponse.getResults().size(),getProductosResponse.getPaging().getLimit());


        String urlProduct = "https://api.mercadolibre.com/items/";
        //Obtengo el codigo de producto en la posicion 10
        String ID_PRODUCTO = getProductosResponse.getResults().get(10).getId();

        GetProductResponse getProductResponse = restTemplate.getForObject(urlProduct + ID_PRODUCTO, GetProductResponse.class);


        System.out.println(getProductResponse.getTitle());
        //Verifico si los titulos sin iguales
        Assert.assertEquals(getProductosResponse.getResults().get(10).getTitle(),getProductResponse.getTitle());
        //Verifico precio
        Assert.assertEquals(getProductResponse.getPrice(),getProductosResponse.getResults().get(10).getPrice());
        //Verifico si acepta mercadopago
        Assert.assertEquals(getProductResponse.isAccepts_mercadopago(),getProductosResponse.getResults().get(10).isAccepts_mercadopago());
        //Verifico la moneda
        Assert.assertEquals(getProductResponse.getCurrency_id(),getProductosResponse.getResults().get(10).getCurrency_id());
        //Verifico si el envio es gratis
        Assert.assertEquals(getProductResponse.getShipping().isFree_shipping(),getProductosResponse.getResults().get(10).getShipping().isFree_shipping());



    }

}
