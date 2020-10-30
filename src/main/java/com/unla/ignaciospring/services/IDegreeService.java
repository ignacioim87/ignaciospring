package com.unla.ignaciospring.services;

import java.util.List;

import com.unla.ignaciospring.entities.Degree;
import com.unla.ignaciospring.models.DegreeModel;

public interface IDegreeService {
	public List<Degree> getAll();
	
	public DegreeModel insertOrUpdate(DegreeModel degreeModel);
	
	public boolean remove(int id);
}
