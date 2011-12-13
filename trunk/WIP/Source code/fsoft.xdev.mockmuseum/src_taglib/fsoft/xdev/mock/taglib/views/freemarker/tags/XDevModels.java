/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package fsoft.xdev.mock.taglib.views.freemarker.tags;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.util.ValueStack;

/**
 * 
 * @author nhanld</a>
 * 
 */
public class XDevModels {
	protected TextLookupModel textLookup;
	
	protected OrganisationListModel organisationList;
	protected OrganisationInputModel organisationInput;
	protected ContactListModel contactList;
	protected ContactInputModel contactInput;
	protected TrustRegionListModel trustRegionList;
	protected TrustRegionInputModel trustRegionInput;
	protected TrustDistrictListModel trustDistrictList;
	protected TrustDistrictInputModel trustDistrictInput;
	protected GovOfficeListModel govOfficeList;
	protected GovOfficeInputModel govOfficeInput;

	private ValueStack           stack;
	private HttpServletRequest   req;
	private HttpServletResponse  res;

	public XDevModels(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
		this.stack = stack;
		this.req = req;
		this.res = res;
	}

	public TextLookupModel getTextLookup() {
		if (textLookup==null) {
			textLookup = new TextLookupModel(stack, req, res);
		}
		return textLookup;
	}	

	public OrganisationListModel getOrganisationList() {
		if (organisationList==null) {
			organisationList = new OrganisationListModel(stack, req, res);
		}
		return organisationList;
	}

	public OrganisationInputModel getOrganisationInput() {
		if (organisationInput==null) {
			organisationInput = new OrganisationInputModel(stack, req, res);
		}
		return organisationInput;
	}

	public ContactListModel getContactList() {
		if (contactList==null) {
			contactList = new ContactListModel(stack, req, res);
		}
		return contactList;
	}

	public ContactInputModel getContactInput() {
		if (contactInput==null) {
			contactInput = new ContactInputModel(stack, req, res);
		}
		return contactInput;
	}

	public TrustRegionListModel getTrustRegionList() {
		if (trustRegionList==null) {
			trustRegionList = new TrustRegionListModel(stack, req, res);
		}
		return trustRegionList;
	}

	public TrustRegionInputModel getTrustRegionInput() {
		if (trustRegionInput==null) {
			trustRegionInput = new TrustRegionInputModel(stack, req, res);
		}
		return trustRegionInput;
	}

	public TrustDistrictListModel getTrustDistrictList() {
		if (trustDistrictList==null) {
			trustDistrictList = new TrustDistrictListModel(stack, req, res);
		}
		return trustDistrictList;
	}

	public TrustDistrictInputModel getTrustDistrictInput() {
		if (trustDistrictInput==null) {
			trustDistrictInput = new TrustDistrictInputModel(stack, req, res);
		}
		return trustDistrictInput;
	}

	public GovOfficeListModel getGovOfficeList() {
		if (govOfficeList==null) {
			govOfficeList = new GovOfficeListModel(stack, req, res);
		}
		return govOfficeList;
	}

	public GovOfficeInputModel getGovOfficeInput() {
		if (govOfficeInput==null) {
			govOfficeInput = new GovOfficeInputModel(stack, req, res);
		}
		return govOfficeInput;
	}
}

