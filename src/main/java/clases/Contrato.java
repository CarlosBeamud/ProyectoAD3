package clases;

import javax.persistence.Embeddable;

@Embeddable
public class Contrato {

    private int idContrato;
    private String tipoContrato;

    public Contrato(int idContrato,String tipoContrato) {
        this.tipoContrato = tipoContrato;
        this.idContrato = idContrato;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "idContrato=" + idContrato +
                ", tipoContrato='" + tipoContrato + '\'' +
                '}';
    }
}
