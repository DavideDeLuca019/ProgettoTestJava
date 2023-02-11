public class libro {
   private String isbn;
   private String titolo;
   private String categoria;
   private double peso;
   private double costo;
   private int pagine;

   public libro (){

   }
   public libro (String isbn, String titolo, String categoria, double peso, double costo, int pagine) {
      this.isbn = isbn;
      this.titolo = titolo;
      this.categoria = categoria;
      this.peso = peso;
      this.costo = costo;
      this.pagine = pagine;
   }
   public void setIsbn (String isbn) {
      this.isbn = isbn;
   }
   public String getIsbn () {
      return isbn;
   }
   public void setTitolo (String titolo) {
      this.titolo = titolo;
   }
   public String getTitolo () {
      return titolo;
   }

   public void setCategoria(String categoria) {
      this.categoria = categoria;
   }

   public String getCategoria () {
      return categoria;
   }

   public void setPeso(double peso) {
      this.peso = peso;
   }

   public double getPeso(){
      return peso;
   }

   public void setCosto(double costo) {
      this.costo = costo;
   }

   public double getCosto (){
      return costo;
   }

   public void setPagine(int pagine) {
      this.pagine = pagine;
   }

   public int getPagine () {
      return pagine;
   }

}
