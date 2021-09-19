package ar.edu.unlp.info.oo1.ejercicio2;

import java.util.*;

public class Balanza {

	private List<Producto> productos;
	
	public Balanza() {
		this.ponerEnCero();
	}
	
	public void ponerEnCero() {
		this.productos = new ArrayList<Producto>();
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}

	public Ticket emitirTicket() {
		Ticket ticket1 = new Ticket();
		ticket1.setCantidadDeProductos(this.getCantidadDeProductos());
		ticket1.setPesoTotal(this.getPesoTotal());
		ticket1.setPrecioTotal(this.getPrecioTotal());
		return ticket1;
	}

	
	/** Getters */

	public List<Producto> getProductos() {
		return productos;
	}

	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(Producto::getPrecio).sum();
	}

	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(Producto::getPeso).sum();
	}

}