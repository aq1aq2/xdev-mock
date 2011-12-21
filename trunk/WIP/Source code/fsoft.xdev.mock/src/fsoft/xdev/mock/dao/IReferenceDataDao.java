package fsoft.xdev.mock.dao;

import java.util.List;

import fsoft.xdev.mock.models.ReferenceDataList;
import fsoft.xdev.mock.models.ReferenceData;

public interface IReferenceDataDao extends BaseDao<ReferenceData> {
	List<ReferenceDataList> getContactType();
	List<ReferenceDataList> getBestContactMethod();
	List<ReferenceDataList> getFacilityType();
	List<ReferenceDataList> getConnectivityType();
}
