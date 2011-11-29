SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[ReferenceData]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[ReferenceData](
	[ReferenceDataID] [int] IDENTITY(1,1) NOT NULL,
	[RefType] [varchar](100) NOT NULL,
	[Value] [text] NULL,
 CONSTRAINT [PK_ReferenceData] PRIMARY KEY CLUSTERED 
(
	[ReferenceDataID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Premises]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Premises](
	[PremiseID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](100) NOT NULL,
	[LocationName] [varchar](100) NOT NULL,
	[KnownAs] [varchar](100) NULL,
	[PrimaryLocation] [bit] NOT NULL,
	[LocationManaged] [bit] NOT NULL,
	[OrgnisationID] [int] NOT NULL,
	[LocationStatus] [varchar](200) NOT NULL,
	[STNetworkConectivity] [bit] NOT NULL,
	[LocationStatusDate] [datetime] NULL,
	[LocationType] [text] NOT NULL,
	[LocationDescription] [text] NULL,
	[AddressLine1] [varchar](200) NULL,
	[AddressLine2] [varchar](200) NULL,
	[AddressLine3] [varchar](200) NULL,
	[PhoneNumber] [varchar](30) NOT NULL,
	[Postcode] [varchar](20) NULL,
	[FaxNumber] [varchar](30) NULL,
	[CityTown] [varchar](100) NULL,
	[MinicommNumber] [varchar](30) NULL,
	[County] [varchar](100) NULL,
	[IsNewShop] [bit] NULL,
	[Nation] [varchar](200) NULL,
	[ShopFlagDate] [datetime] NULL,
	[SpecialistShop] [bit] NOT NULL,
	[Accreditations] [varchar](200) NOT NULL,
	[JCPOffices] [varchar](200) NULL,
	[MediaContact] [bit] NOT NULL,
	[MediaContactID] [int] NULL,
	[CateringFacilities] [bit] NOT NULL,
	[CateringContactID] [int] NULL,
	[CateringType] [int] NULL,
	[LocalDemographicIssue] [text] NULL,
	[ISNetwork] [int] NULL,
	[ClientITFacilities] [bit] NOT NULL,
	[ClientITFacilityDetails] [text] NULL,
	[LocalDemographicNotes] [varchar](200) NULL,
	[RoomAvailability] [bit] NOT NULL,
	[VolunteeringOpportunities] [bit] NOT NULL,
	[OutreachLocation] [text] NULL,
	[LocalHotel] [text] NULL,
	[TravelDetails] [varchar](250) NULL,
	[VisitorParkingOnsite] [bit] NULL,
	[TravelNearestBus] [varchar](250) NULL,
	[VisitorParkingSpaces] [int] NULL,
	[TravelNearestRail] [varchar](250) NULL,
	[TravelNearestAirport] [varchar](250) NULL,
	[VisitorParkingAlternative] [text] NULL,
	[HostVisits] [bit] NULL,
	[ContactID] [int] NULL,
	[RoomOnlyRate] [float] NULL,
	[NegotiatedRoomOnlyRate] [float] NULL,
	[BBRate] [float] NULL,
	[BBNegotiatedRate] [float] NULL,
	[DBBRate] [float] NULL,
	[DBBNegotiatedRate] [float] NULL,
	[DDRate] [float] NULL,
	[DDNegotiatedRate] [float] NULL,
	[RateDay] [float] NULL,
	[NegotiatedRateDay] [float] NULL,
	[TeaAndCoffee] [varchar](200) NULL,
	[Lunch] [bit] NULL,
	[LastNegotiatedDate] [datetime] NULL,
	[ReNegotiatedOn] [datetime] NULL,
	[NoOfMeetingRoom] [int] NULL,
	[PreferedStatus] [varchar](200) NULL,
	[MeetingRoomRatePerDay] [float] NULL,
	[Codings] [varchar](200) NULL,
	[Comments] [text] NULL,
	[OpenTime] [text] NULL,
	[IsActive] [bit] NOT NULL CONSTRAINT [DF_Premises_isActive]  DEFAULT ((1)),
 CONSTRAINT [PK_Premises] PRIMARY KEY CLUSTERED 
(
	[PremiseID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Countries]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Countries](
	[CountryID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](100) NOT NULL,
 CONSTRAINT [PK_NationCountries] PRIMARY KEY CLUSTERED 
(
	[CountryID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Services]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Services](
	[ServiceID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](100) NOT NULL,
	[ShortDescription] [text] NULL,
	[ServiceType] [varchar](100) NULL,
	[ContactID] [int] NULL,
	[IsActive] [bit] NOT NULL CONSTRAINT [DF_Services_IsActive]  DEFAULT ((1)),
	[ServiceSubType] [varchar](100) NULL,
	[FullDescription] [text] NULL,
	[DepartmentID] [int] NOT NULL,
	[ClientDescription] [text] NULL,
	[DescriptionDelivery] [text] NULL,
	[ServiceAttendace] [varchar](100) NULL,
	[ServiceStartExpected] [datetime] NULL,
	[ServiceStart] [datetime] NULL,
	[ServiceEnd] [datetime] NULL,
	[ServiceExtendable] [bit] NULL,
	[ServiceContractCode] [varchar](30) NULL,
	[ServiceContactValue] [float] NULL,
	[ContractStagedPayment] [bit] NULL,
	[ReferralProcessMethod] [varchar](100) NULL,
	[ServiceTimeLimited] [bit] NULL,
	[ServiceTimeLimitedMonth] [int] NULL,
	[ServiceExtendableMonth] [int] NOT NULL,
	[SerBenCrit] [varchar](200) NULL,
	[SerBarCrit] [varchar](200) NULL,
	[SerEthCrit] [varchar](200) NULL,
	[SerDisCrit] [varchar](200) NULL,
	[SerPerCirCrit] [varchar](200) NULL,
	[SerOrtherCrit] [varchar](200) NULL,
	[ClientSupportProcess] [varchar](200) NULL,
	[ClientOutcome] [varchar](200) NULL,
	[Intervention] [varchar](200) NULL,
	[TargetClient] [varchar](200) NULL,
	[ClientJourney] [varchar](200) NULL,
	[Accreditation] [varchar](200) NULL,
	[OtherService] [varchar](200) NULL,
	[ReferralSources] [varchar](200) NULL,
	[ProgrammeID] [int] NULL,
	[SupportCenters] [varchar](200) NULL,
	[ContractOutcome] [varchar](200) NULL,
	[Participartion] [varchar](200) NULL,
	[ContractObligation] [varchar](200) NULL,
 CONSTRAINT [PK_Services] PRIMARY KEY CLUSTERED 
(
	[ServiceID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[TypeOfBusiness]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[TypeOfBusiness](
	[TypeOfBusinessID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](100) NULL,
	[SicCode] [varchar](50) NULL,
 CONSTRAINT [PK_TypeOfBusiness] PRIMARY KEY CLUSTERED 
(
	[TypeOfBusinessID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Users]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Users](
	[UserID] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [varchar](50) NOT NULL,
	[Password] [varchar](30) NOT NULL,
	[Email] [varchar](100) NULL,
	[Permission] [int] NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[UserID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Contacts]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Contacts](
	[ContactID] [int] IDENTITY(1,1) NOT NULL,
	[FirstName] [varchar](50) NOT NULL,
	[SurName] [varchar](50) NOT NULL,
	[KnowAs] [varchar](50) NULL,
	[OfficePhone] [varchar](20) NULL,
	[MobilePhone] [varchar](20) NULL,
	[STHomePhone] [varchar](20) NULL,
	[EmailAddress] [varchar](50) NULL,
	[ManagerID] [int] NULL,
	[ContactType] [varchar](100) NOT NULL,
	[BestContactMethod] [varchar](100) NOT NULL,
	[JobRole] [varchar](50) NULL,
	[WorkBase] [varchar](50) NULL,
	[JobTitle] [varchar](50) NULL,
	[IsActive] [bit] NULL CONSTRAINT [DF_Contact_IsActive]  DEFAULT ((0)),
 CONSTRAINT [PK_Contact] PRIMARY KEY CLUSTERED 
(
	[ContactID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Teams]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Teams](
	[TeamID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](50) NOT NULL,
	[ShortDesc] [text] NULL,
	[ContactID] [int] NOT NULL,
	[CopyAddr] [bit] NULL,
	[Addr1] [varchar](200) NULL,
	[Addr2] [varchar](200) NULL,
	[Addr3] [varchar](200) NULL,
	[PostCode] [varchar](50) NOT NULL,
	[Town] [varchar](100) NULL,
	[County] [varchar](100) NULL,
	[Country] [varchar](100) NULL,
	[TypeOfBusinessID] [int] NOT NULL,
	[FullDesc] [text] NULL,
	[PhoneNumber] [varchar](50) NULL,
	[Fax] [varchar](50) NULL,
	[Email] [varchar](50) NULL,
	[WebAddr] [varchar](50) NULL,
	[DepartmentID] [int] NOT NULL,
	[IsActive] [bit] NOT NULL CONSTRAINT [DF_Team_isActive]  DEFAULT ((1)),
 CONSTRAINT [PK_Team] PRIMARY KEY CLUSTERED 
(
	[TeamID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Service_Premise]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Service_Premise](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PremiseID] [int] NULL,
	[ServiceID] [int] NULL,
	[ProjectCode] [varchar](50) NULL,
 CONSTRAINT [PK_Service_Premise] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[TrustRegions]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[TrustRegions](
	[TrustRegionID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](100) NOT NULL,
	[Description] [text] NULL,
	[CountryID] [int] NOT NULL,
	[IsActive] [bit] NOT NULL CONSTRAINT [DF_TrustRegions_IsActive]  DEFAULT ((1)),
 CONSTRAINT [PK_TrustRegions] PRIMARY KEY CLUSTERED 
(
	[TrustRegionID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Counties]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Counties](
	[CountyID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](100) NOT NULL,
	[CountryID] [int] NOT NULL,
 CONSTRAINT [PK_County] PRIMARY KEY CLUSTERED 
(
	[CountyID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Organisation_Programme]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Organisation_Programme](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[OrganisationID] [int] NOT NULL,
	[ProgrammeID] [int] NOT NULL,
 CONSTRAINT [PK_Organisation_Programme] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Organisation_Service]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Organisation_Service](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[OrganisationID] [int] NOT NULL,
	[ServiceID] [int] NOT NULL,
	[Role] [varchar](100) NULL,
 CONSTRAINT [PK_Organisation_Service] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[SupportingMaterials]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[SupportingMaterials](
	[SupportingMaterialID] [int] IDENTITY(1,1) NOT NULL,
	[Url] [varchar](100) NOT NULL,
	[Description] [text] NULL,
	[Type] [varchar](50) NULL,
	[UserID] [int] NOT NULL,
	[OrganisationID] [int] NOT NULL,
	[AddedDate] [datetime] NOT NULL CONSTRAINT [DF_SupportingMaterial_AddeDate]  DEFAULT (getdate()),
	[IsActive] [bit] NOT NULL CONSTRAINT [DF_SupportingMaterial_isActive]  DEFAULT ((1)),
 CONSTRAINT [PK_SupportingMaterial] PRIMARY KEY CLUSTERED 
(
	[SupportingMaterialID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Programmes]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Programmes](
	[ProgrammeID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](50) NOT NULL,
	[Description] [text] NULL,
	[ContactID] [int] NULL,
	[IsActive] [bit] NOT NULL CONSTRAINT [DF_Programme_isActive]  DEFAULT ((1)),
 CONSTRAINT [PK_Program] PRIMARY KEY CLUSTERED 
(
	[ProgrammeID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Facilities]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Facilities](
	[FacilityID] [int] IDENTITY(1,1) NOT NULL,
	[FacilityType] [int] NOT NULL,
	[FacilityDescription] [ntext] NOT NULL,
	[RoomCapacity] [int] NULL,
	[RoomSize] [int] NULL,
	[RoomConnectivity] [bit] NULL,
	[EquipmentAvailable] [bit] NULL,
	[RoomEquipmentNotes] [varchar](250) NULL,
	[ConnectivityType] [int] NULL,
	[WirelessAccessInfomation] [varchar](200) NULL,
	[ContactID] [int] NULL,
	[RoomHost] [varchar](200) NULL,
	[IsActive] [bit] NOT NULL,
	[PremiseID] [int] NOT NULL,
	[FacilityTypeName] [varchar](200) NULL,
	[LeedContact] [varchar](200) NULL,
	[ContactName] [varchar](200) NULL,
 CONSTRAINT [PK_Facilities] PRIMARY KEY CLUSTERED 
(
	[FacilityID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Directorates]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Directorates](
	[DirectorateID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](50) NOT NULL,
	[ShortDesc] [text] NULL,
	[ContactID] [int] NOT NULL,
	[CopyAddrOrg] [bit] NULL,
	[Addr1] [varchar](200) NOT NULL,
	[Addr2] [varchar](200) NULL,
	[Addr3] [varchar](200) NULL,
	[PostCode] [varchar](50) NOT NULL,
	[Town] [varchar](100) NULL,
	[CountyID] [varchar](100) NULL,
	[CountryID] [varchar](100) NULL,
	[TypeOfBusinessID] [int] NOT NULL,
	[FullDesc] [text] NULL,
	[PhoneNumber] [varchar](50) NULL,
	[Fax] [varchar](50) NULL,
	[Email] [varchar](50) NULL,
	[WebAddr] [varchar](50) NULL,
	[CharityNumber] [varchar](50) NULL,
	[CompanyNumber] [varchar](50) NULL,
	[OrganisationID] [int] NOT NULL,
	[IsActive] [bit] NULL CONSTRAINT [DF_Directorate_isActive]  DEFAULT ((1)),
 CONSTRAINT [PK_Directorate] PRIMARY KEY CLUSTERED 
(
	[DirectorateID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Volunteers]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Volunteers](
	[VolunteerID] [int] IDENTITY(1,1) NOT NULL,
	[ContactID] [int] NOT NULL,
	[VolunteerPurpose] [ntext] NULL,
	[Details] [text] NULL,
	[StartDate] [datetime] NULL,
	[EndDate] [datetime] NULL,
	[PremiseID] [int] NULL,
	[VolunteerNo] [int] NOT NULL,
	[IsActive] [bit] NOT NULL CONSTRAINT [DF_Volunteering_isActive]  DEFAULT ((1)),
 CONSTRAINT [PK_Volunteering] PRIMARY KEY CLUSTERED 
(
	[VolunteerID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[GovtOfficeRegions]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[GovtOfficeRegions](
	[GovtOfficeRegionID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](100) NOT NULL,
	[Description] [text] NULL,
	[CountyID] [int] NOT NULL,
	[IsActive] [bit] NOT NULL,
 CONSTRAINT [PK_GovtOfficeRegions] PRIMARY KEY CLUSTERED 
(
	[GovtOfficeRegionID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Towns]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Towns](
	[TownID] [int] IDENTITY(1,1) NOT NULL,
	[CountyID] [int] NOT NULL,
	[Name] [varchar](100) NULL,
 CONSTRAINT [PK_Town] PRIMARY KEY CLUSTERED 
(
	[TownID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Departments]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Departments](
	[DepartmentID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](50) NOT NULL,
	[ShortDesc] [ntext] NOT NULL,
	[ContactID] [int] NOT NULL,
	[CopyAddr] [bit] NULL,
	[Addr1] [varchar](200) NULL,
	[Addr2] [varchar](200) NULL,
	[Addr3] [varchar](200) NULL,
	[PostCode] [varchar](50) NOT NULL,
	[Town] [varchar](50) NULL,
	[County] [varchar](100) NULL,
	[Country] [varchar](100) NULL,
	[TypeOfBusinessID] [int] NOT NULL,
	[FullDesc] [ntext] NULL,
	[PhoneNumber] [varchar](50) NULL,
	[Fax] [varchar](50) NULL,
	[Email] [varchar](50) NULL,
	[WebAddr] [varchar](50) NULL,
	[DirectorateID] [int] NOT NULL,
	[IsActive] [bit] NOT NULL CONSTRAINT [DF_Department_isActive]  DEFAULT ((1)),
 CONSTRAINT [PK_Department] PRIMARY KEY CLUSTERED 
(
	[DepartmentID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Addresses]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Addresses](
	[AddressID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](150) NOT NULL,
	[PostCode] [varchar](20) NOT NULL,
	[TownID] [int] NOT NULL,
 CONSTRAINT [PK_Address] PRIMARY KEY CLUSTERED 
(
	[AddressID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[TrustDistricts]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[TrustDistricts](
	[TrustDistrictID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](100) NOT NULL,
	[Description] [text] NULL,
	[TrustRegionID] [int] NOT NULL,
	[IsActive] [bit] NOT NULL CONSTRAINT [DF_TrustDistricts_IsActive]  DEFAULT ((1)),
 CONSTRAINT [PK_TrustDistricts] PRIMARY KEY CLUSTERED 
(
	[TrustDistrictID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Organisations]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Organisations](
	[OrganisationID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](100) NOT NULL,
	[ShortDesc] [text] NOT NULL,
	[ContactID] [int] NOT NULL,
	[Addr1] [varchar](200) NOT NULL,
	[Addr2] [varchar](200) NULL,
	[Addr3] [varchar](200) NULL,
	[City] [varchar](100) NULL,
	[County] [varchar](100) NULL,
	[PreferredOrg] [bit] NULL,
	[ExpOfInterest] [bit] NULL,
	[TypeOfBusinessID] [int] NOT NULL,
	[FullDesc] [text] NULL,
	[PhoneNumber] [varchar](50) NOT NULL,
	[Fax] [varchar](50) NULL,
	[Email] [varchar](50) NULL,
	[WebAddr] [varchar](50) NULL,
	[CharityNumber] [varchar](50) NULL,
	[CompanyNumber] [varchar](50) NULL,
	[OrgSpecicalism] [varchar](200) NULL,
	[ServiceDisCap] [varchar](200) NULL,
	[ServiceBarCap] [varchar](200) NULL,
	[ServiceBenCap] [varchar](200) NULL,
	[ServicePerCirCap] [varchar](200) NULL,
	[ServiceEthCap] [varchar](200) NULL,
	[Accreditation] [varchar](200) NULL,
	[EOIProgramme] [varchar](200) NULL,
	[EOIService] [varchar](200) NULL,
	[GovOffRegionID] [int] NOT NULL,
	[TrustDistrictID] [int] NOT NULL,
	[PostCode] [varchar](20) NOT NULL,
	[IsActive] [bit] NOT NULL CONSTRAINT [DF_Organisation_IsActive]  DEFAULT ((1)),
 CONSTRAINT [PK_Organisation] PRIMARY KEY CLUSTERED 
(
	[OrganisationID] ASC
)WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Teams_Contacts]') AND parent_object_id = OBJECT_ID(N'[dbo].[Teams]'))
ALTER TABLE [dbo].[Teams]  WITH CHECK ADD  CONSTRAINT [FK_Teams_Contacts] FOREIGN KEY([ContactID])
REFERENCES [dbo].[Contacts] ([ContactID])
GO
ALTER TABLE [dbo].[Teams] CHECK CONSTRAINT [FK_Teams_Contacts]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Teams_Departments]') AND parent_object_id = OBJECT_ID(N'[dbo].[Teams]'))
ALTER TABLE [dbo].[Teams]  WITH CHECK ADD  CONSTRAINT [FK_Teams_Departments] FOREIGN KEY([DepartmentID])
REFERENCES [dbo].[Departments] ([DepartmentID])
GO
ALTER TABLE [dbo].[Teams] CHECK CONSTRAINT [FK_Teams_Departments]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Teams_TypeOfBusiness]') AND parent_object_id = OBJECT_ID(N'[dbo].[Teams]'))
ALTER TABLE [dbo].[Teams]  WITH CHECK ADD  CONSTRAINT [FK_Teams_TypeOfBusiness] FOREIGN KEY([TypeOfBusinessID])
REFERENCES [dbo].[TypeOfBusiness] ([TypeOfBusinessID])
GO
ALTER TABLE [dbo].[Teams] CHECK CONSTRAINT [FK_Teams_TypeOfBusiness]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Service_Premise_Premises]') AND parent_object_id = OBJECT_ID(N'[dbo].[Service_Premise]'))
ALTER TABLE [dbo].[Service_Premise]  WITH CHECK ADD  CONSTRAINT [FK_Service_Premise_Premises] FOREIGN KEY([PremiseID])
REFERENCES [dbo].[Premises] ([PremiseID])
GO
ALTER TABLE [dbo].[Service_Premise] CHECK CONSTRAINT [FK_Service_Premise_Premises]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Service_Premise_Services]') AND parent_object_id = OBJECT_ID(N'[dbo].[Service_Premise]'))
ALTER TABLE [dbo].[Service_Premise]  WITH CHECK ADD  CONSTRAINT [FK_Service_Premise_Services] FOREIGN KEY([ServiceID])
REFERENCES [dbo].[Services] ([ServiceID])
GO
ALTER TABLE [dbo].[Service_Premise] CHECK CONSTRAINT [FK_Service_Premise_Services]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_TrustRegions_Countries]') AND parent_object_id = OBJECT_ID(N'[dbo].[TrustRegions]'))
ALTER TABLE [dbo].[TrustRegions]  WITH CHECK ADD  CONSTRAINT [FK_TrustRegions_Countries] FOREIGN KEY([CountryID])
REFERENCES [dbo].[Countries] ([CountryID])
GO
ALTER TABLE [dbo].[TrustRegions] CHECK CONSTRAINT [FK_TrustRegions_Countries]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Counties_Countries]') AND parent_object_id = OBJECT_ID(N'[dbo].[Counties]'))
ALTER TABLE [dbo].[Counties]  WITH CHECK ADD  CONSTRAINT [FK_Counties_Countries] FOREIGN KEY([CountryID])
REFERENCES [dbo].[Countries] ([CountryID])
GO
ALTER TABLE [dbo].[Counties] CHECK CONSTRAINT [FK_Counties_Countries]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Organisation_Programme_Organisations]') AND parent_object_id = OBJECT_ID(N'[dbo].[Organisation_Programme]'))
ALTER TABLE [dbo].[Organisation_Programme]  WITH CHECK ADD  CONSTRAINT [FK_Organisation_Programme_Organisations] FOREIGN KEY([OrganisationID])
REFERENCES [dbo].[Organisations] ([OrganisationID])
GO
ALTER TABLE [dbo].[Organisation_Programme] CHECK CONSTRAINT [FK_Organisation_Programme_Organisations]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Organisation_Programme_Programmes]') AND parent_object_id = OBJECT_ID(N'[dbo].[Organisation_Programme]'))
ALTER TABLE [dbo].[Organisation_Programme]  WITH CHECK ADD  CONSTRAINT [FK_Organisation_Programme_Programmes] FOREIGN KEY([ProgrammeID])
REFERENCES [dbo].[Programmes] ([ProgrammeID])
GO
ALTER TABLE [dbo].[Organisation_Programme] CHECK CONSTRAINT [FK_Organisation_Programme_Programmes]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Organisation_Service_Organisations]') AND parent_object_id = OBJECT_ID(N'[dbo].[Organisation_Service]'))
ALTER TABLE [dbo].[Organisation_Service]  WITH CHECK ADD  CONSTRAINT [FK_Organisation_Service_Organisations] FOREIGN KEY([OrganisationID])
REFERENCES [dbo].[Organisations] ([OrganisationID])
GO
ALTER TABLE [dbo].[Organisation_Service] CHECK CONSTRAINT [FK_Organisation_Service_Organisations]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Organisation_Service_Services]') AND parent_object_id = OBJECT_ID(N'[dbo].[Organisation_Service]'))
ALTER TABLE [dbo].[Organisation_Service]  WITH CHECK ADD  CONSTRAINT [FK_Organisation_Service_Services] FOREIGN KEY([ServiceID])
REFERENCES [dbo].[Services] ([ServiceID])
GO
ALTER TABLE [dbo].[Organisation_Service] CHECK CONSTRAINT [FK_Organisation_Service_Services]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_SupportingMaterials_Organisations]') AND parent_object_id = OBJECT_ID(N'[dbo].[SupportingMaterials]'))
ALTER TABLE [dbo].[SupportingMaterials]  WITH CHECK ADD  CONSTRAINT [FK_SupportingMaterials_Organisations] FOREIGN KEY([OrganisationID])
REFERENCES [dbo].[Organisations] ([OrganisationID])
GO
ALTER TABLE [dbo].[SupportingMaterials] CHECK CONSTRAINT [FK_SupportingMaterials_Organisations]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_SupportingMaterials_Users]') AND parent_object_id = OBJECT_ID(N'[dbo].[SupportingMaterials]'))
ALTER TABLE [dbo].[SupportingMaterials]  WITH CHECK ADD  CONSTRAINT [FK_SupportingMaterials_Users] FOREIGN KEY([UserID])
REFERENCES [dbo].[Users] ([UserID])
GO
ALTER TABLE [dbo].[SupportingMaterials] CHECK CONSTRAINT [FK_SupportingMaterials_Users]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Programmes_Contacts]') AND parent_object_id = OBJECT_ID(N'[dbo].[Programmes]'))
ALTER TABLE [dbo].[Programmes]  WITH CHECK ADD  CONSTRAINT [FK_Programmes_Contacts] FOREIGN KEY([ContactID])
REFERENCES [dbo].[Contacts] ([ContactID])
GO
ALTER TABLE [dbo].[Programmes] CHECK CONSTRAINT [FK_Programmes_Contacts]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Facilities_Contacts]') AND parent_object_id = OBJECT_ID(N'[dbo].[Facilities]'))
ALTER TABLE [dbo].[Facilities]  WITH CHECK ADD  CONSTRAINT [FK_Facilities_Contacts] FOREIGN KEY([ContactID])
REFERENCES [dbo].[Contacts] ([ContactID])
GO
ALTER TABLE [dbo].[Facilities] CHECK CONSTRAINT [FK_Facilities_Contacts]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Directorates_Contacts]') AND parent_object_id = OBJECT_ID(N'[dbo].[Directorates]'))
ALTER TABLE [dbo].[Directorates]  WITH CHECK ADD  CONSTRAINT [FK_Directorates_Contacts] FOREIGN KEY([ContactID])
REFERENCES [dbo].[Contacts] ([ContactID])
GO
ALTER TABLE [dbo].[Directorates] CHECK CONSTRAINT [FK_Directorates_Contacts]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Volunteers_Contacts]') AND parent_object_id = OBJECT_ID(N'[dbo].[Volunteers]'))
ALTER TABLE [dbo].[Volunteers]  WITH CHECK ADD  CONSTRAINT [FK_Volunteers_Contacts] FOREIGN KEY([ContactID])
REFERENCES [dbo].[Contacts] ([ContactID])
GO
ALTER TABLE [dbo].[Volunteers] CHECK CONSTRAINT [FK_Volunteers_Contacts]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_GovtOfficeRegions_Counties]') AND parent_object_id = OBJECT_ID(N'[dbo].[GovtOfficeRegions]'))
ALTER TABLE [dbo].[GovtOfficeRegions]  WITH CHECK ADD  CONSTRAINT [FK_GovtOfficeRegions_Counties] FOREIGN KEY([CountyID])
REFERENCES [dbo].[Counties] ([CountyID])
GO
ALTER TABLE [dbo].[GovtOfficeRegions] CHECK CONSTRAINT [FK_GovtOfficeRegions_Counties]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Towns_Counties]') AND parent_object_id = OBJECT_ID(N'[dbo].[Towns]'))
ALTER TABLE [dbo].[Towns]  WITH CHECK ADD  CONSTRAINT [FK_Towns_Counties] FOREIGN KEY([CountyID])
REFERENCES [dbo].[Counties] ([CountyID])
GO
ALTER TABLE [dbo].[Towns] CHECK CONSTRAINT [FK_Towns_Counties]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Departments_Directorates]') AND parent_object_id = OBJECT_ID(N'[dbo].[Departments]'))
ALTER TABLE [dbo].[Departments]  WITH CHECK ADD  CONSTRAINT [FK_Departments_Directorates] FOREIGN KEY([DirectorateID])
REFERENCES [dbo].[Directorates] ([DirectorateID])
GO
ALTER TABLE [dbo].[Departments] CHECK CONSTRAINT [FK_Departments_Directorates]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Addresses_Towns]') AND parent_object_id = OBJECT_ID(N'[dbo].[Addresses]'))
ALTER TABLE [dbo].[Addresses]  WITH CHECK ADD  CONSTRAINT [FK_Addresses_Towns] FOREIGN KEY([TownID])
REFERENCES [dbo].[Towns] ([TownID])
GO
ALTER TABLE [dbo].[Addresses] CHECK CONSTRAINT [FK_Addresses_Towns]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_TrustDistricts_TrustRegions]') AND parent_object_id = OBJECT_ID(N'[dbo].[TrustDistricts]'))
ALTER TABLE [dbo].[TrustDistricts]  WITH CHECK ADD  CONSTRAINT [FK_TrustDistricts_TrustRegions] FOREIGN KEY([TrustRegionID])
REFERENCES [dbo].[TrustRegions] ([TrustRegionID])
GO
ALTER TABLE [dbo].[TrustDistricts] CHECK CONSTRAINT [FK_TrustDistricts_TrustRegions]
GO
IF NOT EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_Organisations_TrustDistricts]') AND parent_object_id = OBJECT_ID(N'[dbo].[Organisations]'))
ALTER TABLE [dbo].[Organisations]  WITH CHECK ADD  CONSTRAINT [FK_Organisations_TrustDistricts] FOREIGN KEY([TrustDistrictID])
REFERENCES [dbo].[TrustDistricts] ([TrustDistrictID])
GO
ALTER TABLE [dbo].[Organisations] CHECK CONSTRAINT [FK_Organisations_TrustDistricts]
