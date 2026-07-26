package org.pcap4j.packet.namednumber;

import defpackage.o40;
import java.util.HashMap;
import java.util.Map;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11VenueInfo extends NamedNumber<Short, Dot11VenueInfo> {
    public static final Dot11VenueInfo AIRPLANE;
    public static final Dot11VenueInfo ALCOHOL_AND_DRUG_REHABILITATION_CENTER;
    public static final Dot11VenueInfo ATTORNEY_OFFICE;
    public static final Dot11VenueInfo AUTOMOBILE_OR_TRUCK;
    public static final Dot11VenueInfo AUTOMOTIVE_SERVICE_STATION;
    public static final Dot11VenueInfo BANK;
    public static final Dot11VenueInfo BOARDING_HOUSE;
    public static final Dot11VenueInfo BUS;
    public static final Dot11VenueInfo BUS_STOP;
    public static final Dot11VenueInfo CITY_PARK;
    public static final Dot11VenueInfo DOCTOR_OR_DENTIST_OFFICE;
    public static final Dot11VenueInfo DORMITORY;
    public static final Dot11VenueInfo EMERGENCY_COORDINATION_CENTER;
    public static final Dot11VenueInfo FACTORY;
    public static final Dot11VenueInfo FERRY;
    public static final Dot11VenueInfo FIRE_STATION;
    public static final Dot11VenueInfo GAS_STATION;
    public static final Dot11VenueInfo GROCERY_MARKET;
    public static final Dot11VenueInfo GROUP_HOME;
    public static final Dot11VenueInfo HOSPITAL;
    public static final Dot11VenueInfo HOTEL_OR_MOTEL;
    public static final Dot11VenueInfo KIOSK;
    public static final Dot11VenueInfo LONG_TERM_CARE_FACILITY;
    public static final Dot11VenueInfo MOTOR_BIKE;
    public static final Dot11VenueInfo MUNI_MESH_NETWORK;
    public static final Dot11VenueInfo POLICE_STATION;
    public static final Dot11VenueInfo POST_OFFICE;
    public static final Dot11VenueInfo PRISON_OR_JAIL;
    public static final Dot11VenueInfo PRIVATE_RESIDENCE;
    public static final Dot11VenueInfo PROFESSIONAL_OFFICE;
    public static final Dot11VenueInfo RESEARCH_AND_DEVELOPMENT_FACILITY;
    public static final Dot11VenueInfo REST_AREA;
    public static final Dot11VenueInfo RETAIL_STORE;
    public static final Dot11VenueInfo SCHOOL_PRIMARY;
    public static final Dot11VenueInfo SCHOOL_SECONDARY;
    public static final Dot11VenueInfo SHIP_OR_BOAT;
    public static final Dot11VenueInfo SHOPPING_MALL;
    public static final Dot11VenueInfo TRAFFIC_CONTROL;
    public static final Dot11VenueInfo TRAIN;
    public static final Dot11VenueInfo UNIVERSITY_OR_COLLEGE;
    public static final Dot11VenueInfo UNSPECIFIED_BUSINESS;
    public static final Dot11VenueInfo UNSPECIFIED_EDUCATIONAL;
    public static final Dot11VenueInfo UNSPECIFIED_FACTORY_AND_INDUSTRIAL;
    public static final Dot11VenueInfo UNSPECIFIED_INSTITUTIONAL;
    public static final Dot11VenueInfo UNSPECIFIED_MERCANTILE;
    public static final Dot11VenueInfo UNSPECIFIED_OUTDOOR;
    public static final Dot11VenueInfo UNSPECIFIED_RESIDENTIAL;
    public static final Dot11VenueInfo UNSPECIFIED_STORAGE;
    public static final Dot11VenueInfo UNSPECIFIED_UTILITY_AND_MISCELLANEOUS;
    public static final Dot11VenueInfo UNSPECIFIED_VEHICULAR;
    private static final Map<Short, Dot11VenueInfo> registry;
    private static final long serialVersionUID = 7218904434618722743L;

    static {
        Dot11VenueInfo dot11VenueInfo = new Dot11VenueInfo((short) 271, "Emergency Coordination Center");
        EMERGENCY_COORDINATION_CENTER = dot11VenueInfo;
        Dot11VenueInfo dot11VenueInfo2 = new Dot11VenueInfo((short) 512, "Unspecified Business");
        UNSPECIFIED_BUSINESS = dot11VenueInfo2;
        Dot11VenueInfo dot11VenueInfo3 = new Dot11VenueInfo((short) 513, "Doctor or Dentist office");
        DOCTOR_OR_DENTIST_OFFICE = dot11VenueInfo3;
        Dot11VenueInfo dot11VenueInfo4 = new Dot11VenueInfo((short) 514, "Bank");
        BANK = dot11VenueInfo4;
        Dot11VenueInfo dot11VenueInfo5 = new Dot11VenueInfo((short) 515, "Fire Station");
        FIRE_STATION = dot11VenueInfo5;
        Dot11VenueInfo dot11VenueInfo6 = new Dot11VenueInfo((short) 516, "Police Station");
        POLICE_STATION = dot11VenueInfo6;
        Dot11VenueInfo dot11VenueInfo7 = new Dot11VenueInfo((short) 518, "Post Office");
        POST_OFFICE = dot11VenueInfo7;
        Dot11VenueInfo dot11VenueInfo8 = new Dot11VenueInfo((short) 519, "Professional Office");
        PROFESSIONAL_OFFICE = dot11VenueInfo8;
        Dot11VenueInfo dot11VenueInfo9 = new Dot11VenueInfo((short) 520, "Research and Development Facility");
        RESEARCH_AND_DEVELOPMENT_FACILITY = dot11VenueInfo9;
        Dot11VenueInfo dot11VenueInfo10 = new Dot11VenueInfo((short) 521, "Attorney Office");
        ATTORNEY_OFFICE = dot11VenueInfo10;
        Dot11VenueInfo dot11VenueInfo11 = new Dot11VenueInfo((short) 768, "Unspecified Educational");
        UNSPECIFIED_EDUCATIONAL = dot11VenueInfo11;
        Dot11VenueInfo dot11VenueInfo12 = new Dot11VenueInfo((short) 769, "School Primary");
        SCHOOL_PRIMARY = dot11VenueInfo12;
        Dot11VenueInfo dot11VenueInfo13 = new Dot11VenueInfo((short) 770, "School Secondary");
        SCHOOL_SECONDARY = dot11VenueInfo13;
        Dot11VenueInfo dot11VenueInfo14 = new Dot11VenueInfo((short) 771, "University or College");
        UNIVERSITY_OR_COLLEGE = dot11VenueInfo14;
        Dot11VenueInfo dot11VenueInfo15 = new Dot11VenueInfo((short) 1024, "Unspecified Factory and Industrial");
        UNSPECIFIED_FACTORY_AND_INDUSTRIAL = dot11VenueInfo15;
        Dot11VenueInfo dot11VenueInfo16 = new Dot11VenueInfo((short) 1025, "Factory");
        FACTORY = dot11VenueInfo16;
        Dot11VenueInfo dot11VenueInfo17 = new Dot11VenueInfo((short) 1280, "Unspecified Institutional");
        UNSPECIFIED_INSTITUTIONAL = dot11VenueInfo17;
        Dot11VenueInfo dot11VenueInfo18 = new Dot11VenueInfo((short) 1281, "Hospital");
        HOSPITAL = dot11VenueInfo18;
        Dot11VenueInfo dot11VenueInfo19 = new Dot11VenueInfo((short) 1282, "Long-Term Care Facility");
        LONG_TERM_CARE_FACILITY = dot11VenueInfo19;
        Dot11VenueInfo dot11VenueInfo20 = new Dot11VenueInfo((short) 1283, "Alcohol and Drug Rehabilitation Center");
        ALCOHOL_AND_DRUG_REHABILITATION_CENTER = dot11VenueInfo20;
        Dot11VenueInfo dot11VenueInfo21 = new Dot11VenueInfo((short) 1284, "Group Home");
        GROUP_HOME = dot11VenueInfo21;
        Dot11VenueInfo dot11VenueInfo22 = new Dot11VenueInfo((short) 1285, "Prison or Jail");
        PRISON_OR_JAIL = dot11VenueInfo22;
        Dot11VenueInfo dot11VenueInfo23 = new Dot11VenueInfo((short) 1536, "Unspecified Mercantile");
        UNSPECIFIED_MERCANTILE = dot11VenueInfo23;
        Dot11VenueInfo dot11VenueInfo24 = new Dot11VenueInfo((short) 1537, "Retail Store");
        RETAIL_STORE = dot11VenueInfo24;
        Dot11VenueInfo dot11VenueInfo25 = new Dot11VenueInfo((short) 1538, "Grocery Market");
        GROCERY_MARKET = dot11VenueInfo25;
        Dot11VenueInfo dot11VenueInfo26 = new Dot11VenueInfo((short) 1539, "Automotive Service Station");
        AUTOMOTIVE_SERVICE_STATION = dot11VenueInfo26;
        Dot11VenueInfo dot11VenueInfo27 = new Dot11VenueInfo((short) 1540, "Shopping Mall");
        SHOPPING_MALL = dot11VenueInfo27;
        Dot11VenueInfo dot11VenueInfo28 = new Dot11VenueInfo((short) 1541, "Gas Station");
        GAS_STATION = dot11VenueInfo28;
        Dot11VenueInfo dot11VenueInfo29 = new Dot11VenueInfo((short) 1792, "Unspecified Residential");
        UNSPECIFIED_RESIDENTIAL = dot11VenueInfo29;
        Dot11VenueInfo dot11VenueInfo30 = new Dot11VenueInfo((short) 1793, "Private Residence");
        PRIVATE_RESIDENCE = dot11VenueInfo30;
        Dot11VenueInfo dot11VenueInfo31 = new Dot11VenueInfo((short) 1794, "Hotel or Motel");
        HOTEL_OR_MOTEL = dot11VenueInfo31;
        Dot11VenueInfo dot11VenueInfo32 = new Dot11VenueInfo((short) 1795, "Dormitory");
        DORMITORY = dot11VenueInfo32;
        Dot11VenueInfo dot11VenueInfo33 = new Dot11VenueInfo((short) 1796, "Boarding House");
        BOARDING_HOUSE = dot11VenueInfo33;
        Dot11VenueInfo dot11VenueInfo34 = new Dot11VenueInfo((short) 2048, "Unspecified Storage");
        UNSPECIFIED_STORAGE = dot11VenueInfo34;
        Dot11VenueInfo dot11VenueInfo35 = new Dot11VenueInfo((short) 2304, "Unspecified Utility and Miscellaneous");
        UNSPECIFIED_UTILITY_AND_MISCELLANEOUS = dot11VenueInfo35;
        Dot11VenueInfo dot11VenueInfo36 = new Dot11VenueInfo((short) 2560, "Unspecified Vehicular");
        UNSPECIFIED_VEHICULAR = dot11VenueInfo36;
        Dot11VenueInfo dot11VenueInfo37 = new Dot11VenueInfo((short) 2561, "Automobile or Truck");
        AUTOMOBILE_OR_TRUCK = dot11VenueInfo37;
        Dot11VenueInfo dot11VenueInfo38 = new Dot11VenueInfo((short) 2562, "Airplane");
        AIRPLANE = dot11VenueInfo38;
        Dot11VenueInfo dot11VenueInfo39 = new Dot11VenueInfo((short) 2563, "Bus");
        BUS = dot11VenueInfo39;
        Dot11VenueInfo dot11VenueInfo40 = new Dot11VenueInfo((short) 2564, "Ferry");
        FERRY = dot11VenueInfo40;
        Dot11VenueInfo dot11VenueInfo41 = new Dot11VenueInfo((short) 2565, "Ship or Boat");
        SHIP_OR_BOAT = dot11VenueInfo41;
        Dot11VenueInfo dot11VenueInfo42 = new Dot11VenueInfo((short) 2566, "Train");
        TRAIN = dot11VenueInfo42;
        Dot11VenueInfo dot11VenueInfo43 = new Dot11VenueInfo((short) 2567, "Motor Bike");
        MOTOR_BIKE = dot11VenueInfo43;
        Dot11VenueInfo dot11VenueInfo44 = new Dot11VenueInfo((short) 2816, "Unspecified Outdoor");
        UNSPECIFIED_OUTDOOR = dot11VenueInfo44;
        Dot11VenueInfo dot11VenueInfo45 = new Dot11VenueInfo((short) 2817, "Muni-mesh Network");
        MUNI_MESH_NETWORK = dot11VenueInfo45;
        Dot11VenueInfo dot11VenueInfo46 = new Dot11VenueInfo((short) 2818, "City Park");
        CITY_PARK = dot11VenueInfo46;
        Dot11VenueInfo dot11VenueInfo47 = new Dot11VenueInfo((short) 2819, "Rest Area");
        REST_AREA = dot11VenueInfo47;
        Dot11VenueInfo dot11VenueInfo48 = new Dot11VenueInfo((short) 2820, "Traffic Control");
        TRAFFIC_CONTROL = dot11VenueInfo48;
        Dot11VenueInfo dot11VenueInfo49 = new Dot11VenueInfo((short) 2821, "Bus Stop");
        BUS_STOP = dot11VenueInfo49;
        Dot11VenueInfo dot11VenueInfo50 = new Dot11VenueInfo((short) 2822, "Kiosk");
        KIOSK = dot11VenueInfo50;
        HashMap map = new HashMap();
        registry = map;
        o40.N(dot11VenueInfo, map, dot11VenueInfo, dot11VenueInfo2, dot11VenueInfo2);
        o40.N(dot11VenueInfo3, map, dot11VenueInfo3, dot11VenueInfo4, dot11VenueInfo4);
        o40.N(dot11VenueInfo5, map, dot11VenueInfo5, dot11VenueInfo6, dot11VenueInfo6);
        o40.N(dot11VenueInfo7, map, dot11VenueInfo7, dot11VenueInfo8, dot11VenueInfo8);
        o40.N(dot11VenueInfo9, map, dot11VenueInfo9, dot11VenueInfo10, dot11VenueInfo10);
        o40.N(dot11VenueInfo11, map, dot11VenueInfo11, dot11VenueInfo12, dot11VenueInfo12);
        o40.N(dot11VenueInfo13, map, dot11VenueInfo13, dot11VenueInfo14, dot11VenueInfo14);
        o40.N(dot11VenueInfo15, map, dot11VenueInfo15, dot11VenueInfo16, dot11VenueInfo16);
        o40.N(dot11VenueInfo17, map, dot11VenueInfo17, dot11VenueInfo18, dot11VenueInfo18);
        o40.N(dot11VenueInfo19, map, dot11VenueInfo19, dot11VenueInfo20, dot11VenueInfo20);
        o40.N(dot11VenueInfo21, map, dot11VenueInfo21, dot11VenueInfo22, dot11VenueInfo22);
        o40.N(dot11VenueInfo23, map, dot11VenueInfo23, dot11VenueInfo24, dot11VenueInfo24);
        o40.N(dot11VenueInfo25, map, dot11VenueInfo25, dot11VenueInfo26, dot11VenueInfo26);
        o40.N(dot11VenueInfo27, map, dot11VenueInfo27, dot11VenueInfo28, dot11VenueInfo28);
        o40.N(dot11VenueInfo29, map, dot11VenueInfo29, dot11VenueInfo30, dot11VenueInfo30);
        o40.N(dot11VenueInfo31, map, dot11VenueInfo31, dot11VenueInfo32, dot11VenueInfo32);
        o40.N(dot11VenueInfo33, map, dot11VenueInfo33, dot11VenueInfo34, dot11VenueInfo34);
        o40.N(dot11VenueInfo35, map, dot11VenueInfo35, dot11VenueInfo36, dot11VenueInfo36);
        o40.N(dot11VenueInfo37, map, dot11VenueInfo37, dot11VenueInfo38, dot11VenueInfo38);
        o40.N(dot11VenueInfo39, map, dot11VenueInfo39, dot11VenueInfo40, dot11VenueInfo40);
        o40.N(dot11VenueInfo41, map, dot11VenueInfo41, dot11VenueInfo42, dot11VenueInfo42);
        o40.N(dot11VenueInfo43, map, dot11VenueInfo43, dot11VenueInfo44, dot11VenueInfo44);
        o40.N(dot11VenueInfo45, map, dot11VenueInfo45, dot11VenueInfo46, dot11VenueInfo46);
        o40.N(dot11VenueInfo47, map, dot11VenueInfo47, dot11VenueInfo48, dot11VenueInfo48);
        o40.N(dot11VenueInfo49, map, dot11VenueInfo49, dot11VenueInfo50, dot11VenueInfo50);
    }

    public Dot11VenueInfo(Short sh, String str) {
        super(sh, str);
    }

    public static Dot11VenueInfo getInstance(Short sh) {
        Map<Short, Dot11VenueInfo> map = registry;
        return map.containsKey(sh) ? map.get(sh) : new Dot11VenueInfo(sh, "unknown");
    }

    public static Dot11VenueInfo register(Dot11VenueInfo dot11VenueInfo) {
        return registry.put(dot11VenueInfo.value(), dot11VenueInfo);
    }

    public Dot11VenueGroup getVenueGroup() {
        return Dot11VenueGroup.getInstance(Byte.valueOf((byte) (value().shortValue() >> 8)));
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String toString() {
        StringBuilder sb = new StringBuilder(70);
        sb.append(getVenueGroup().name());
        sb.append("/");
        sb.append(name());
        sb.append(" (");
        sb.append(valueAsString());
        sb.append(")");
        return sb.toString();
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        return "0x" + ByteArrays.toHexString(value().shortValue(), "");
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(Dot11VenueInfo dot11VenueInfo) {
        return value().compareTo(dot11VenueInfo.value());
    }
}
