package fsoft.xdev.mock.actions.geography;

import fsoft.xdev.mock.dao.ITrustRegionsDao;
import fsoft.xdev.mock.models.TrustRegions;

public class TrustRegionsAction {
	private TrustRegions trustRegions;
	private ITrustRegionsDao trustRegionDao;

	public TrustRegions getTrustRegions() {
		return trustRegions;
	}

	public void setTrustRegions(TrustRegions trustRegions) {
		this.trustRegions = trustRegions;
	}

	public void setTrustRegionDao(ITrustRegionsDao trustRegionDao) {
		this.trustRegionDao = trustRegionDao;
	}

}
