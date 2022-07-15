package com.porfolio.richard.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="educacion")
public class Educacion {
	/*defino los atributos de la entidades*/
	
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Long idEdu;
		@NotBlank
		@Column(unique=true)
		private String tituloEdu;
		@NotNull
		private int fechaEdu;
		@NotNull
		private String descEdu;

		private String imagenEdu;
	
		/*constructor vacio*/
		public Educacion(){
		}
	
		/*constructor parametrizado*/
		public Educacion (Long idEdu,String tituloEdu,int fechaEdu,String descEdu,String imagenEdu){
		this.idEdu = idEdu;
		this.tituloEdu = tituloEdu;
		this.fechaEdu = fechaEdu;
		this.descEdu = descEdu;
		this.imagenEdu = imagenEdu;
		}

		public Long getIdEdu(){
			return idEdu;
		}
		public void setIdEdu(Long idEdu){
			this.idEdu = idEdu;
		}
		public String getTituloEdu(){
			return tituloEdu;
		}
		public void setTituloEdu(String tituloEdu){
			this.tituloEdu = tituloEdu;
		}
		public int getFechaEdu(){
			return fechaEdu;
		}
		public void setFechaEdu (int fechaEdu){
			this.fechaEdu = fechaEdu;
		}
		public String getDescEdu(){
			return descEdu;
		}
		public void setDescEdu(String descEdu){
			this.descEdu = descEdu;
		}
		public String getImagenEdu(){
			return imagenEdu;
		}
		public void setImagenEdu(String imagenEdu){
			this.imagenEdu = imagenEdu;
		}


	}
	




