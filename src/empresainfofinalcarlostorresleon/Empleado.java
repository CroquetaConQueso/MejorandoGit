
package empresainfofinalcarlostorresleon;

public class Empleado {
    private String sNombre;
    private int iSalario;
    private int iPermanencia;
    
    public Empleado(){
        
    }

    public Empleado(String sNombre, int iSalario, int iPermanencia) {
        this.sNombre = sNombre;
        this.iSalario = iSalario;
        this.iPermanencia = iPermanencia;
    }

    public int getiPermanencia() {
        return iPermanencia;
    }

    public int getiSalario() {
        return iSalario;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setiPermanencia(int iPermanencia) {
        this.iPermanencia = iPermanencia;
    }

    public void setiSalario(int iSalario) {
        this.iSalario = iSalario;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }
    //utilizo el valor publico sobre el valor privado, no devuelvo un valor por lo que continua siendo void
    public void mostrarClasificacion(){
        if (iPermanencia <3){
            System.out.println("El empleado " + sNombre + " lleva " + iPermanencia+ " meses en la empresa \ny  su nivel es considerado un principiante");
        }
        else if (iPermanencia < 18 && iPermanencia > 3){
            System.out.println("El empleado " + sNombre + " lleva " + iPermanencia+ " meses en la empresa \ny su nivel es considerado intermedio");
        }
        else if (iPermanencia > 18){
            System.out.println("El empleado " + sNombre + " lleva " + iPermanencia+ " meses en la empresa \ny su nivel es considerado senior ");
        }
        
    }
    
    public void datosEmpleado(){
        System.out.println("Datos del empleado:");
        System.out.println("Nombre: "+sNombre);
        System.out.println("Salario: "+iSalario);
        System.out.println("Permanencia: "+iPermanencia);
    }
    //Actualizo el valor publico al final
    public void subirSalario(int porcentaje){
        int total = 0;
        
        total = iSalario + (iSalario * porcentaje / 100);
        System.out.println("Tras sumar el porcentaje "+porcentaje+"% al salario "+iSalario+"e obtenemos: "+total+"e");
        iSalario = total;
    }
}
