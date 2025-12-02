package Creacionales.Prototype;

public class Reporte implements IDocumento{
    // El Prototipo Concreto
    private String titulo;
    private MetaDatos metaDatos;

    public Reporte (String titulo, MetaDatos metaDatos){
        this.titulo = titulo;
        this.metaDatos = metaDatos;
    }

    public MetaDatos getMetaDatos() {
        return metaDatos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String mostrarInfo() {
        return "Titulo: " + titulo + " | Metadatos (Fecha): " + metaDatos.getFechaCreacion() +
                " | Objeto ID: " + this.hashCode() +
                " | Metadatos ID: " + metaDatos.hashCode();
    }

    //Logica de clonacion

    @Override
    public IDocumento clone() throws CloneNotSupportedException {
        // 1. Clonación Superficial: Se obtiene una copia de los campos primitivos (titulo)
        //    y las referencias (metadatos).
        Reporte clon = (Reporte) super.clone();

        // 2. Clonación PROFUNDA: Se sobrescribe la referencia del objeto complejo
        //    para garantizar que el clon tenga su propia instancia de Metadatos.
        clon.metaDatos = (MetaDatos) this.metaDatos.clone();
        return clon;
    }
}
