package org.pcap4j.core;

import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import defpackage.f98;
import defpackage.uh5;
import defpackage.y88;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class NativePacketDllMappings {
    static final String LIB_NAME;
    static final int PACKET_OID_DATA_SIZE;

    static {
        String property = System.getProperty(NativePacketDllMappings.class.getPackage().getName() + ".packetLibName", "Packet");
        LIB_NAME = property;
        Logger logger = uh5.h;
        Native.r(NativePacketDllMappings.class, uh5.e(Collections.EMPTY_MAP, property));
        PACKET_OID_DATA_SIZE = new PACKET_OID_DATA().size();
    }

    private NativePacketDllMappings() {
    }

    public static native void PacketCloseAdapter(Pointer pointer);

    public static native Pointer PacketOpenAdapter(String str);

    public static native int PacketRequest(Pointer pointer, int i, PACKET_OID_DATA packet_oid_data);

    public static class PACKET_OID_DATA extends f98 {
        public byte[] Data;
        public NativeLong Length;
        public NativeLong Oid;

        public static class ByReference extends PACKET_OID_DATA implements y88 {
        }

        public PACKET_OID_DATA() {
            this.Data = new byte[6];
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Oid");
            arrayList.add("Length");
            arrayList.add("Data");
            return arrayList;
        }

        public PACKET_OID_DATA(Pointer pointer) {
            super(pointer, 0);
            this.Data = new byte[6];
            read();
        }
    }
}
