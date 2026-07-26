package org.pcap4j.core;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.sun.jna.Callback;
import com.sun.jna.Function;
import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import defpackage.bq2;
import defpackage.d77;
import defpackage.f98;
import defpackage.m96;
import defpackage.o54;
import defpackage.p54;
import defpackage.uh5;
import defpackage.y88;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes4.dex */
final class NativeMappings {
    static final Pointer ERRNO_P;
    private static final Logger LOG;
    static final ByteOrder NATIVE_BYTE_ORDER;
    static final Map<String, Object> NATIVE_LOAD_LIBRARY_OPTIONS;
    static final Function PCAP_DUMP;
    static final String PCAP_LIB_NAME;
    static final int SBIOCSTIME = 16897;

    public static class PcapErrbuf extends f98 {
        public byte[] buf = new byte[PCAP_ERRBUF_SIZE()];

        private static int PCAP_ERRBUF_SIZE() {
            return 256;
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("buf");
            return arrayList;
        }

        public int length() {
            return toString().length();
        }

        @Override // defpackage.f98
        public String toString() {
            byte[] bArr = this.buf;
            Charset charsetE = Native.e(Native.g());
            int length = bArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (bArr[i] == 0) {
                    length = i;
                    break;
                }
                i++;
            }
            return length == 0 ? "" : new String(bArr, 0, length, charsetE);
        }
    }

    public interface PcapLibrary extends p54 {
        public static final PcapLibrary INSTANCE;

        static {
            String str = NativeMappings.PCAP_LIB_NAME;
            Map<String, Object> map = NativeMappings.NATIVE_LOAD_LIBRARY_OPTIONS;
            java.util.logging.Logger logger = Native.a;
            if (p54.class.isAssignableFrom(PcapLibrary.class)) {
                Object objNewProxyInstance = Proxy.newProxyInstance(PcapLibrary.class.getClassLoader(), new Class[]{PcapLibrary.class}, new o54(str, PcapLibrary.class, map));
                Native.a(PcapLibrary.class, map, objNewProxyInstance);
                INSTANCE = (PcapLibrary) ((p54) PcapLibrary.class.cast(objNewProxyInstance));
                return;
            }
            throw new IllegalArgumentException("Interface (" + PcapLibrary.class.getSimpleName() + ") of library=" + str + " does not extend " + p54.class.getSimpleName());
        }

        int dos_pcap_stats_ex(Pointer pointer, pcap_stat_ex pcap_stat_exVar);

        Pointer pcap_open_dead_with_tstamp_precision(int i, int i2, int i3);

        Pointer pcap_open_offline_with_tstamp_precision(String str, int i, PcapErrbuf pcapErrbuf);

        int pcap_set_immediate_mode(Pointer pointer, int i);

        int pcap_set_rfmon(Pointer pointer, int i);

        int pcap_set_tstamp_precision(Pointer pointer, int i);

        int strioctl(int i, int i2, int i3, Pointer pointer);

        Pointer win_pcap_stats_ex(Pointer pointer, IntByReference intByReference);
    }

    public static class bpf_insn extends f98 {
        public short code;
        public byte jf;
        public byte jt;
        public int k;

        public static class ByReference extends bpf_insn implements y88 {
        }

        public bpf_insn() {
            setAutoSynch(false);
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("code");
            arrayList.add("jt");
            arrayList.add("jf");
            arrayList.add("k");
            return arrayList;
        }
    }

    public static class bpf_program extends f98 {
        public bpf_insn.ByReference bf_insns;
        public int bf_len;

        public bpf_program() {
            setAutoSynch(false);
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("bf_len");
            arrayList.add("bf_insns");
            return arrayList;
        }
    }

    public static class in6_addr extends f98 {
        public byte[] s6_addr = new byte[16];

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("s6_addr");
            return arrayList;
        }
    }

    public static class in_addr extends f98 {
        public int s_addr;

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("s_addr");
            return arrayList;
        }
    }

    public interface pcap_handler extends Callback {
        void got_packet(Pointer pointer, Pointer pointer2, Pointer pointer3);
    }

    public static class pcap_stat_ex extends f98 {
        public NativeLong collisions;
        public NativeLong multicast;
        public NativeLong rx_bytes;
        public NativeLong rx_crc_errors;
        public NativeLong rx_dropped;
        public NativeLong rx_errors;
        public NativeLong rx_fifo_errors;
        public NativeLong rx_frame_errors;
        public NativeLong rx_length_errors;
        public NativeLong rx_missed_errors;
        public NativeLong rx_over_errors;
        public NativeLong rx_packets;
        public NativeLong tx_aborted_errors;
        public NativeLong tx_bytes;
        public NativeLong tx_carrier_errors;
        public NativeLong tx_dropped;
        public NativeLong tx_errors;
        public NativeLong tx_fifo_errors;
        public NativeLong tx_heartbeat_errors;
        public NativeLong tx_packets;
        public NativeLong tx_window_errors;

        public static class ByReference extends pcap_stat_ex implements y88 {
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("rx_packets");
            arrayList.add("tx_packets");
            arrayList.add("rx_bytes");
            arrayList.add("tx_bytes");
            arrayList.add("rx_errors");
            arrayList.add("tx_errors");
            arrayList.add("rx_dropped");
            arrayList.add("tx_dropped");
            arrayList.add("multicast");
            arrayList.add("collisions");
            arrayList.add("rx_length_errors");
            arrayList.add("rx_over_errors");
            arrayList.add("rx_crc_errors");
            arrayList.add("rx_frame_errors");
            arrayList.add("rx_fifo_errors");
            arrayList.add("rx_missed_errors");
            arrayList.add("tx_aborted_errors");
            arrayList.add("tx_carrier_errors");
            arrayList.add("tx_fifo_errors");
            arrayList.add("tx_heartbeat_errors");
            arrayList.add("tx_window_errors");
            return arrayList;
        }
    }

    public static class timeval extends f98 {
        public static final int TV_SEC_OFFSET;
        public static final int TV_USEC_OFFSET;
        public NativeLong tv_sec;
        public NativeLong tv_usec;

        static {
            timeval timevalVar = new timeval();
            TV_SEC_OFFSET = timevalVar.fieldOffset("tv_sec");
            TV_USEC_OFFSET = timevalVar.fieldOffset("tv_usec");
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("tv_sec");
            arrayList.add("tv_usec");
            return arrayList;
        }
    }

    public static class win_pcap_stat extends pcap_stat {
        public static final int BS_CAPT_OFFSET = new win_pcap_stat().fieldOffset("bs_capt");
        public int bs_capt;

        public static class ByReference extends win_pcap_stat implements y88 {
        }

        public win_pcap_stat() {
        }

        public static int getBsCapt(Pointer pointer) {
            return pointer.e(BS_CAPT_OFFSET);
        }

        @Override // org.pcap4j.core.NativeMappings.pcap_stat, defpackage.f98
        public List<String> getFieldOrder() {
            List<String> fieldOrder = super.getFieldOrder();
            fieldOrder.add("bs_capt");
            return fieldOrder;
        }

        public win_pcap_stat(Pointer pointer) {
            super(pointer);
            read();
        }
    }

    static {
        Pointer pointer;
        Logger logger = LoggerFactory.getLogger((Class<?>) NativeMappings.class);
        LOG = logger;
        String property = System.getProperty(NativeMappings.class.getPackage().getName() + ".pcapLibName", m96.h() ? "wpcap" : "pcap");
        PCAP_LIB_NAME = property;
        d77 d77Var = Function.g;
        java.util.logging.Logger logger2 = uh5.h;
        Map map = Collections.EMPTY_MAP;
        uh5 uh5VarE = uh5.e(map, property);
        PCAP_DUMP = uh5VarE.c(uh5VarE.e, "pcap_dump");
        HashMap map2 = new HashMap();
        NATIVE_LOAD_LIBRARY_OPTIONS = map2;
        NATIVE_BYTE_ORDER = ByteOrder.nativeOrder();
        if (m96.e == 3) {
            try {
                long j = uh5.e(map, property).a;
                if (j == 0) {
                    throw new UnsatisfiedLinkError("Library has been unloaded");
                }
                pointer = new Pointer(Native.findSymbol(j, "errno"));
            } catch (UnsatisfiedLinkError e) {
                throw new UnsatisfiedLinkError("Error looking up 'errno': " + e.getMessage());
            }
        } else {
            pointer = null;
        }
        ERRNO_P = pointer;
        Native.r(NativeMappings.class, uh5.e(map, property));
        final HashMap map3 = new HashMap();
        map3.put("pcap_set_rfmon", "pcap_set_rfmon");
        map3.put("strioctl", "strioctl");
        map3.put("dos_pcap_stats_ex", "pcap_stats_ex");
        map3.put("win_pcap_stats_ex", "pcap_stats_ex");
        map3.put("pcap_open_offline_with_tstamp_precision", "pcap_open_offline_with_tstamp_precision");
        map3.put("pcap_open_dead_with_tstamp_precision", "pcap_open_dead_with_tstamp_precision");
        map3.put("pcap_set_tstamp_precision", "pcap_set_tstamp_precision");
        map3.put("pcap_set_immediate_mode", "pcap_set_immediate_mode");
        map2.put("function-mapper", new bq2() { // from class: org.pcap4j.core.NativeMappings.1
            @Override // defpackage.bq2
            public String getFunctionName(uh5 uh5Var, Method method) {
                return (String) map3.get(method.getName());
            }
        });
        logger.info("Pcap4J successfully loaded a native pcap library: {}", pcap_lib_version());
    }

    public static native int bpf_filter(bpf_insn.ByReference byReference, byte[] bArr, int i, int i2);

    public static int getFdFromPcapT(Pointer pointer) {
        if (m96.h()) {
            return -1;
        }
        return pointer.e(0L);
    }

    public static native int pcap_activate(Pointer pointer);

    public static native void pcap_breakloop(Pointer pointer);

    public static native void pcap_close(Pointer pointer);

    public static native int pcap_compile(Pointer pointer, bpf_program bpf_programVar, String str, int i, int i2);

    public static native int pcap_compile_nopcap(int i, int i2, bpf_program bpf_programVar, String str, int i3, int i4);

    public static native Pointer pcap_create(String str, PcapErrbuf pcapErrbuf);

    public static native int pcap_datalink(Pointer pointer);

    public static native int pcap_datalink_name_to_val(String str);

    public static native String pcap_datalink_val_to_description(int i);

    public static native String pcap_datalink_val_to_name(int i);

    public static native int pcap_dispatch(Pointer pointer, int i, pcap_handler pcap_handlerVar, Pointer pointer2);

    public static native void pcap_dump(Pointer pointer, pcap_pkthdr pcap_pkthdrVar, byte[] bArr);

    public static native void pcap_dump_close(Pointer pointer);

    public static native int pcap_dump_flush(Pointer pointer);

    public static native NativeLong pcap_dump_ftell(Pointer pointer);

    public static native Pointer pcap_dump_open(Pointer pointer, String str);

    public static native int pcap_findalldevs(PointerByReference pointerByReference, PcapErrbuf pcapErrbuf);

    public static native void pcap_free_datalinks(Pointer pointer);

    public static native void pcap_freealldevs(Pointer pointer);

    public static native void pcap_freecode(bpf_program bpf_programVar);

    public static native Pointer pcap_geterr(Pointer pointer);

    public static native int pcap_getnonblock(Pointer pointer, PcapErrbuf pcapErrbuf);

    public static native int pcap_is_swapped(Pointer pointer);

    public static native String pcap_lib_version();

    public static native int pcap_list_datalinks(Pointer pointer, PointerByReference pointerByReference);

    public static native Pointer pcap_lookupdev(PcapErrbuf pcapErrbuf);

    public static native int pcap_lookupnet(String str, IntByReference intByReference, IntByReference intByReference2, PcapErrbuf pcapErrbuf);

    public static native int pcap_loop(Pointer pointer, int i, Function function, Pointer pointer2);

    public static native int pcap_loop(Pointer pointer, int i, pcap_handler pcap_handlerVar, Pointer pointer2);

    public static native int pcap_major_version(Pointer pointer);

    public static native int pcap_minor_version(Pointer pointer);

    public static native Pointer pcap_next(Pointer pointer, pcap_pkthdr pcap_pkthdrVar);

    public static native int pcap_next_ex(Pointer pointer, PointerByReference pointerByReference, PointerByReference pointerByReference2);

    public static native Pointer pcap_open_dead(int i, int i2);

    public static native Pointer pcap_open_live(String str, int i, int i2, int i3, PcapErrbuf pcapErrbuf);

    public static native Pointer pcap_open_offline(String str, PcapErrbuf pcapErrbuf);

    public static native int pcap_sendpacket(Pointer pointer, byte[] bArr, int i);

    public static native int pcap_set_buffer_size(Pointer pointer, int i);

    public static native int pcap_set_datalink(Pointer pointer, int i);

    public static native int pcap_set_promisc(Pointer pointer, int i);

    public static native int pcap_set_snaplen(Pointer pointer, int i);

    public static native int pcap_set_timeout(Pointer pointer, int i);

    public static native int pcap_setdirection(Pointer pointer, int i);

    public static native int pcap_setfilter(Pointer pointer, bpf_program bpf_programVar);

    public static native int pcap_setnonblock(Pointer pointer, int i, PcapErrbuf pcapErrbuf);

    public static native int pcap_snapshot(Pointer pointer);

    public static native int pcap_stats(Pointer pointer, pcap_stat pcap_statVar);

    public static native Pointer pcap_strerror(int i);

    public static class pcap_addr extends f98 {
        public sockaddr.ByReference addr;
        public sockaddr.ByReference broadaddr;
        public sockaddr.ByReference dstaddr;
        public sockaddr.ByReference netmask;
        public ByReference next;

        public static class ByReference extends pcap_addr implements y88 {
        }

        public pcap_addr(Pointer pointer) {
            super(pointer, 0);
            read();
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("next");
            arrayList.add("addr");
            arrayList.add("netmask");
            arrayList.add("broadaddr");
            arrayList.add("dstaddr");
            return arrayList;
        }

        public pcap_addr() {
        }
    }

    public static class pcap_if extends f98 {
        public pcap_addr.ByReference addresses;
        public String description;
        public int flags;
        public String name;
        public ByReference next;

        public static class ByReference extends pcap_if implements y88 {
        }

        public pcap_if(Pointer pointer) {
            super(pointer, 0);
            read();
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("next");
            arrayList.add(AppMeasurementSdk.ConditionalUserProperty.NAME);
            arrayList.add(PackageListMetaDataDTO.KEY_DESCRIPTION);
            arrayList.add("addresses");
            arrayList.add("flags");
            return arrayList;
        }

        public pcap_if() {
        }
    }

    public static class pcap_pkthdr extends f98 {
        public static final int CAPLEN_OFFSET;
        public static final int LEN_OFFSET;
        public static final int TS_OFFSET;
        public int caplen;
        public int len;
        public timeval ts;

        public static class ByReference extends pcap_pkthdr implements y88 {
        }

        static {
            pcap_pkthdr pcap_pkthdrVar = new pcap_pkthdr();
            TS_OFFSET = pcap_pkthdrVar.fieldOffset("ts");
            CAPLEN_OFFSET = pcap_pkthdrVar.fieldOffset("caplen");
            LEN_OFFSET = pcap_pkthdrVar.fieldOffset("len");
        }

        public pcap_pkthdr(Pointer pointer) {
            super(pointer, 0);
            read();
        }

        public static int getCaplen(Pointer pointer) {
            return pointer.e(CAPLEN_OFFSET);
        }

        public static int getLen(Pointer pointer) {
            return pointer.e(LEN_OFFSET);
        }

        public static NativeLong getTvSec(Pointer pointer) {
            long j = TS_OFFSET + timeval.TV_SEC_OFFSET;
            pointer.getClass();
            return new NativeLong(NativeLong.d == 8 ? pointer.f(j) : pointer.e(j));
        }

        public static NativeLong getTvUsec(Pointer pointer) {
            long j = TS_OFFSET + timeval.TV_USEC_OFFSET;
            pointer.getClass();
            return new NativeLong(NativeLong.d == 8 ? pointer.f(j) : pointer.e(j));
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("ts");
            arrayList.add("caplen");
            arrayList.add("len");
            return arrayList;
        }

        public pcap_pkthdr() {
        }
    }

    public static class pcap_stat extends f98 {
        public static final int PS_DROP_OFFSET;
        public static final int PS_IFDROP_OFFSET;
        public static final int PS_RECV_OFFSET;
        public int ps_drop;
        public int ps_ifdrop;
        public int ps_recv;

        public static class ByReference extends pcap_stat implements y88 {
        }

        static {
            pcap_stat pcap_statVar = new pcap_stat();
            PS_RECV_OFFSET = pcap_statVar.fieldOffset("ps_recv");
            PS_DROP_OFFSET = pcap_statVar.fieldOffset("ps_drop");
            PS_IFDROP_OFFSET = pcap_statVar.fieldOffset("ps_ifdrop");
        }

        public pcap_stat(Pointer pointer) {
            super(pointer, 0);
            read();
        }

        public static int getPsDrop(Pointer pointer) {
            return pointer.e(PS_DROP_OFFSET);
        }

        public static int getPsIfdrop(Pointer pointer) {
            return pointer.e(PS_IFDROP_OFFSET);
        }

        public static int getPsRecv(Pointer pointer) {
            return pointer.e(PS_RECV_OFFSET);
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("ps_recv");
            arrayList.add("ps_drop");
            arrayList.add("ps_ifdrop");
            return arrayList;
        }

        public pcap_stat() {
        }
    }

    public static class sockaddr_in6 extends f98 {
        public in6_addr sin6_addr;
        public short sin6_family;
        public int sin6_flowinfo;
        public short sin6_port;
        public int sin6_scope_id;

        public sockaddr_in6(Pointer pointer) {
            super(pointer, 0);
            read();
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("sin6_family");
            arrayList.add("sin6_port");
            arrayList.add("sin6_flowinfo");
            arrayList.add("sin6_addr");
            arrayList.add("sin6_scope_id");
            return arrayList;
        }

        public short getSaFamily() {
            if (sockaddr.isWindowsType()) {
                return this.sin6_family;
            }
            return (short) ((NativeMappings.NATIVE_BYTE_ORDER.equals(ByteOrder.BIG_ENDIAN) ? this.sin6_family : this.sin6_family >> 8) & 255);
        }

        public sockaddr_in6() {
        }
    }

    public static class sockaddr extends f98 {
        public byte[] sa_data;
        public short sa_family;

        public static class ByReference extends sockaddr implements y88 {
        }

        public sockaddr(Pointer pointer) {
            super(pointer, 0);
            this.sa_data = new byte[14];
            read();
        }

        public static boolean isWindowsType() {
            return (m96.f() || m96.d() || m96.e == 5 || m96.i()) ? false : true;
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("sa_family");
            arrayList.add("sa_data");
            return arrayList;
        }

        public short getSaFamily() {
            if (isWindowsType()) {
                return this.sa_family;
            }
            return (short) ((NativeMappings.NATIVE_BYTE_ORDER.equals(ByteOrder.BIG_ENDIAN) ? this.sa_family : this.sa_family >> 8) & 255);
        }

        public sockaddr() {
            this.sa_data = new byte[14];
        }
    }

    public static class sockaddr_dl extends f98 {
        public byte sdl_alen;
        public byte[] sdl_data;
        public byte sdl_family;
        public short sdl_index;
        public byte sdl_len;
        public byte sdl_nlen;
        public byte sdl_slen;
        public byte sdl_type;

        public sockaddr_dl(Pointer pointer) {
            super(pointer, 0);
            this.sdl_data = new byte[46];
            read();
        }

        public byte[] getAddress() {
            Pointer pointer = getPointer();
            long j = (this.sdl_nlen & 255) + 8;
            int i = this.sdl_alen & 255;
            pointer.getClass();
            byte[] bArr = new byte[i];
            pointer.m(i, j, bArr);
            return bArr;
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("sdl_len");
            arrayList.add("sdl_family");
            arrayList.add("sdl_index");
            arrayList.add("sdl_type");
            arrayList.add("sdl_nlen");
            arrayList.add("sdl_alen");
            arrayList.add("sdl_slen");
            arrayList.add("sdl_data");
            return arrayList;
        }

        public sockaddr_dl() {
            this.sdl_data = new byte[46];
        }
    }

    public static class sockaddr_in extends f98 {
        public in_addr sin_addr;
        public short sin_family;
        public short sin_port;
        public byte[] sin_zero;

        public sockaddr_in(Pointer pointer) {
            super(pointer, 0);
            this.sin_zero = new byte[8];
            read();
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("sin_family");
            arrayList.add("sin_port");
            arrayList.add("sin_addr");
            arrayList.add("sin_zero");
            return arrayList;
        }

        public short getSaFamily() {
            if (sockaddr.isWindowsType()) {
                return this.sin_family;
            }
            return (short) ((NativeMappings.NATIVE_BYTE_ORDER.equals(ByteOrder.BIG_ENDIAN) ? this.sin_family : this.sin_family >> 8) & 255);
        }

        public sockaddr_in() {
            this.sin_zero = new byte[8];
        }
    }

    public static class sockaddr_ll extends f98 {
        public byte[] sll_addr;
        public short sll_family;
        public byte sll_halen;
        public short sll_hatype;
        public int sll_ifindex;
        public byte sll_pkttype;
        public short sll_protocol;

        public sockaddr_ll(Pointer pointer) {
            super(pointer, 0);
            this.sll_addr = new byte[8];
            read();
        }

        @Override // defpackage.f98
        public List<String> getFieldOrder() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("sll_family");
            arrayList.add("sll_protocol");
            arrayList.add("sll_ifindex");
            arrayList.add("sll_hatype");
            arrayList.add("sll_pkttype");
            arrayList.add("sll_halen");
            arrayList.add("sll_addr");
            return arrayList;
        }

        public short getSaFamily() {
            if (sockaddr.isWindowsType()) {
                return this.sll_family;
            }
            return (short) ((NativeMappings.NATIVE_BYTE_ORDER.equals(ByteOrder.BIG_ENDIAN) ? this.sll_family : this.sll_family >> 8) & 255);
        }

        public sockaddr_ll() {
            this.sll_addr = new byte[8];
        }
    }
}
