package tn.codeinc.services;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import tn.codeinc.persistance.TestLevel;


@Local
public interface TestLevelManagementLocal {
	public String TestParticipation(TestLevel test);
	public List<TestLevel> listAllMyTestParticipation(String participant);
	public List<TestLevel> trackMyProgress(String participant);
}
