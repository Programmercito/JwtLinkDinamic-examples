/*
* licencia de codigo privativo 
 */
package org.osbo.jwtlinkdinamic.examples;

import org.osbo.jwtmessage.message.JwtMessage;

/**
 *
 * @author hered
 */
public class JwtLinkDinamic {

    public static void main(String[] args) {
        String link = "https://sitio.me/ruta/${jwt}";
        MonedaPrecio monedap = new MonedaPrecio();
        monedap.setMoneda("Dolar");
        monedap.setPrecio(33.23);
        String resul = JwtMessage.generate(link, monedap);
        System.out.println(resul);
    }

    private static class MonedaPrecio {

        private String moneda;
        private Double precio;

        public MonedaPrecio() {
        }

        /**
         * @return the moneda
         */
        public String getMoneda() {
            return moneda;
        }

        /**
         * @param moneda the moneda to set
         */
        public void setMoneda(String moneda) {
            this.moneda = moneda;
        }

        /**
         * @return the precio
         */
        public Double getPrecio() {
            return precio;
        }

        /**
         * @param precio the precio to set
         */
        public void setPrecio(Double precio) {
            this.precio = precio;
        }
    }
}
