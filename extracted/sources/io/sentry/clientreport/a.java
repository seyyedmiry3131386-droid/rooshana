package io.sentry.clientreport;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.o40;
import io.sentry.SentryLevel;
import io.sentry.h3;
import io.sentry.o3;
import io.sentry.protocol.Device$DeviceOrientation;
import io.sentry.protocol.e0;
import io.sentry.protocol.g;
import io.sentry.protocol.i;
import io.sentry.protocol.j;
import io.sentry.protocol.l;
import io.sentry.protocol.p;
import io.sentry.protocol.r;
import io.sentry.protocol.v;
import io.sentry.protocol.x;
import io.sentry.s1;
import io.sentry.u0;
import io.sentry.vendor.gson.stream.JsonToken;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public static io.sentry.protocol.a b(h3 h3Var, u0 u0Var) {
        String strM0;
        h3Var.P0();
        io.sentry.protocol.a aVar = new io.sentry.protocol.a();
        ConcurrentHashMap concurrentHashMap = null;
        while (h3Var.peek() == JsonToken.NAME) {
            strM0 = h3Var.m0();
            strM0.getClass();
            switch (strM0) {
                case "split_names":
                    List list = (List) h3Var.O0();
                    if (list == null) {
                        break;
                    } else {
                        aVar.m = list;
                        break;
                    }
                    break;
                case "device_app_hash":
                    aVar.c = h3Var.S();
                    break;
                case "start_type":
                    aVar.j = h3Var.S();
                    break;
                case "view_names":
                    List list2 = (List) h3Var.O0();
                    if (list2 == null) {
                        break;
                    } else {
                        aVar.i = list2;
                        break;
                    }
                    break;
                case "app_version":
                    aVar.f = h3Var.S();
                    break;
                case "in_foreground":
                    aVar.k = h3Var.z0();
                    break;
                case "build_type":
                    aVar.d = h3Var.S();
                    break;
                case "app_identifier":
                    aVar.a = h3Var.S();
                    break;
                case "app_start_time":
                    aVar.b = h3Var.v0(u0Var);
                    break;
                case "permissions":
                    aVar.h = io.sentry.config.a.Q((Map) h3Var.O0());
                    break;
                case "app_name":
                    aVar.e = h3Var.S();
                    break;
                case "app_build":
                    aVar.g = h3Var.S();
                    break;
                case "is_split_apks":
                    aVar.l = h3Var.z0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    h3Var.H(u0Var, concurrentHashMap, strM0);
                    break;
            }
        }
        aVar.n = concurrentHashMap;
        h3Var.t0();
        return aVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static io.sentry.protocol.e c(h3 h3Var, u0 u0Var) {
        byte b;
        String strM0;
        String strM02;
        String strM03;
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        h3Var.P0();
        while (h3Var.peek() == JsonToken.NAME) {
            String strM04 = h3Var.m0();
            strM04.getClass();
            int i = 11;
            switch (strM04.hashCode()) {
                case -1335157162:
                    b = !strM04.equals("device") ? (byte) -1 : (byte) 0;
                    break;
                case -895679987:
                    b = !strM04.equals("spring") ? (byte) -1 : (byte) 1;
                    break;
                case -340323263:
                    b = !strM04.equals("response") ? (byte) -1 : (byte) 2;
                    break;
                case -309425751:
                    b = !strM04.equals("profile") ? (byte) -1 : (byte) 3;
                    break;
                case -191501435:
                    b = !strM04.equals("feedback") ? (byte) -1 : (byte) 4;
                    break;
                case 3556:
                    b = !strM04.equals("os") ? (byte) -1 : (byte) 5;
                    break;
                case 96801:
                    b = !strM04.equals("app") ? (byte) -1 : (byte) 6;
                    break;
                case 96867:
                    b = !strM04.equals("art") ? (byte) -1 : (byte) 7;
                    break;
                case 102572:
                    b = !strM04.equals("gpu") ? (byte) -1 : (byte) 8;
                    break;
                case 97513095:
                    b = !strM04.equals("flags") ? (byte) -1 : (byte) 9;
                    break;
                case 110620997:
                    b = !strM04.equals("trace") ? (byte) -1 : (byte) 10;
                    break;
                case 150940456:
                    b = !strM04.equals("browser") ? (byte) -1 : (byte) 11;
                    break;
                case 1550962648:
                    b = !strM04.equals("runtime") ? (byte) -1 : (byte) 12;
                    break;
                default:
                    b = -1;
                    break;
            }
            ArrayList arrayList = null;
            switch (b) {
                case 0:
                    eVar.o(d(h3Var, u0Var));
                    break;
                case 1:
                    h3Var.P0();
                    e0 e0Var = new e0();
                    ConcurrentHashMap concurrentHashMap = null;
                    while (h3Var.peek() == JsonToken.NAME) {
                        String strM05 = h3Var.m0();
                        strM05.getClass();
                        if (strM05.equals("active_profiles")) {
                            List list = (List) h3Var.O0();
                            if (list != null) {
                                String[] strArr = new String[list.size()];
                                list.toArray(strArr);
                                e0Var.a = strArr;
                            }
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            h3Var.H(u0Var, concurrentHashMap, strM05);
                        }
                    }
                    e0Var.b = concurrentHashMap;
                    h3Var.t0();
                    eVar.u(e0Var);
                    break;
                case 2:
                    h3Var.P0();
                    r rVar = new r();
                    ConcurrentHashMap concurrentHashMap2 = null;
                    while (h3Var.peek() == JsonToken.NAME) {
                        strM0 = h3Var.m0();
                        strM0.getClass();
                        switch (strM0) {
                            case "status_code":
                                rVar.c = h3Var.C();
                                break;
                            case "data":
                                rVar.e = h3Var.O0();
                                break;
                            case "headers":
                                Map map = (Map) h3Var.O0();
                                if (map != null) {
                                    rVar.b = io.sentry.config.a.Q(map);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "cookies":
                                rVar.a = h3Var.S();
                                break;
                            case "body_size":
                                rVar.d = h3Var.L();
                                break;
                            default:
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                h3Var.H(u0Var, concurrentHashMap2, strM0);
                                break;
                        }
                    }
                    rVar.f = concurrentHashMap2;
                    h3Var.t0();
                    eVar.s(rVar);
                    break;
                case 3:
                    h3Var.P0();
                    o3 o3Var = new o3(v.b);
                    ConcurrentHashMap concurrentHashMap3 = null;
                    while (h3Var.peek() == JsonToken.NAME) {
                        String strM06 = h3Var.m0();
                        strM06.getClass();
                        if (strM06.equals("profiler_id")) {
                            v vVar = (v) h3Var.M0(u0Var, new a(23));
                            if (vVar != null) {
                                o3Var.a = vVar;
                            }
                        } else {
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            h3Var.H(u0Var, concurrentHashMap3, strM06);
                        }
                    }
                    o3Var.b = concurrentHashMap3;
                    h3Var.t0();
                    eVar.k(o3Var, "profile");
                    break;
                case 4:
                    eVar.k(e(h3Var, u0Var), "feedback");
                    break;
                case 5:
                    eVar.r(g(h3Var, u0Var));
                    break;
                case 6:
                    eVar.m(b(h3Var, u0Var));
                    break;
                case 7:
                    h3Var.P0();
                    io.sentry.protocol.c cVar = new io.sentry.protocol.c();
                    ConcurrentHashMap concurrentHashMap4 = null;
                    while (h3Var.peek() == JsonToken.NAME) {
                        strM02 = h3Var.m0();
                        strM02.getClass();
                        switch (strM02) {
                            case "gc.total_time":
                                cVar.b = h3Var.h0();
                                break;
                            case "memory.free_until_gc":
                                cVar.h = h3Var.L();
                                break;
                            case "gc.blocking_time":
                                cVar.d = h3Var.h0();
                                break;
                            case "gc.waiting_time":
                                cVar.f = h3Var.h0();
                                break;
                            case "memory.free_until_oome":
                                cVar.i = h3Var.L();
                                break;
                            case "memory.total":
                                cVar.j = h3Var.L();
                                break;
                            case "gc.pre_oome_count":
                                cVar.e = h3Var.L();
                                break;
                            case "memory.free":
                                cVar.g = h3Var.L();
                                break;
                            case "gc.blocking_count":
                                cVar.c = h3Var.L();
                                break;
                            case "gc.total_count":
                                cVar.a = h3Var.L();
                                break;
                            case "memory.max":
                                cVar.k = h3Var.L();
                                break;
                            default:
                                if (concurrentHashMap4 == null) {
                                    concurrentHashMap4 = new ConcurrentHashMap();
                                }
                                h3Var.H(u0Var, concurrentHashMap4, strM02);
                                break;
                        }
                    }
                    cVar.l = concurrentHashMap4;
                    h3Var.t0();
                    eVar.k(cVar, "art");
                    break;
                case 8:
                    eVar.q(f(h3Var, u0Var));
                    break;
                case 9:
                    h3Var.P0();
                    ConcurrentHashMap concurrentHashMap5 = null;
                    while (h3Var.peek() == JsonToken.NAME) {
                        String strM07 = h3Var.m0();
                        strM07.getClass();
                        if (strM07.equals("values")) {
                            arrayList = h3Var.Z0(u0Var, new a(i));
                        } else {
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            h3Var.H(u0Var, concurrentHashMap5, strM07);
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    i iVar = new i(arrayList);
                    iVar.b = concurrentHashMap5;
                    h3Var.t0();
                    eVar.p(iVar);
                    break;
                case 10:
                    eVar.v(io.sentry.e.b(h3Var, u0Var));
                    break;
                case 11:
                    h3Var.P0();
                    io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                    ConcurrentHashMap concurrentHashMap6 = null;
                    while (h3Var.peek() == JsonToken.NAME) {
                        String strM08 = h3Var.m0();
                        strM08.getClass();
                        if (strM08.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                            dVar.a = h3Var.S();
                        } else if (strM08.equals("version")) {
                            dVar.b = h3Var.S();
                        } else {
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            h3Var.H(u0Var, concurrentHashMap6, strM08);
                        }
                    }
                    dVar.c = concurrentHashMap6;
                    h3Var.t0();
                    eVar.n(dVar);
                    break;
                case 12:
                    h3Var.P0();
                    x xVar = new x();
                    ConcurrentHashMap concurrentHashMap7 = null;
                    while (h3Var.peek() == JsonToken.NAME) {
                        strM03 = h3Var.m0();
                        strM03.getClass();
                        switch (strM03) {
                            case "raw_description":
                                xVar.c = h3Var.S();
                                break;
                            case "name":
                                xVar.a = h3Var.S();
                                break;
                            case "version":
                                xVar.b = h3Var.S();
                                break;
                            default:
                                if (concurrentHashMap7 == null) {
                                    concurrentHashMap7 = new ConcurrentHashMap();
                                }
                                h3Var.H(u0Var, concurrentHashMap7, strM03);
                                break;
                        }
                    }
                    xVar.d = concurrentHashMap7;
                    h3Var.t0();
                    eVar.t(xVar);
                    break;
                default:
                    Object objO0 = h3Var.O0();
                    if (objO0 != null) {
                        eVar.k(objO0, strM04);
                    }
                    break;
            }
        }
        h3Var.t0();
        return eVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static g d(h3 h3Var, u0 u0Var) {
        h3Var.P0();
        g gVar = new g();
        ConcurrentHashMap concurrentHashMap = null;
        while (h3Var.peek() == JsonToken.NAME) {
            String strM0 = h3Var.m0();
            strM0.getClass();
            int i = 10;
            byte b = -1;
            switch (strM0.hashCode()) {
                case -2076227591:
                    if (strM0.equals("timezone")) {
                        b = 0;
                    }
                    break;
                case -2012489734:
                    if (strM0.equals("boot_time")) {
                        b = 1;
                    }
                    break;
                case -1981332476:
                    if (strM0.equals("simulator")) {
                        b = 2;
                    }
                    break;
                case -1969347631:
                    if (strM0.equals("manufacturer")) {
                        b = 3;
                    }
                    break;
                case -1608004830:
                    if (strM0.equals("processor_count")) {
                        b = 4;
                    }
                    break;
                case -1439500848:
                    if (strM0.equals("orientation")) {
                        b = 5;
                    }
                    break;
                case -1410521534:
                    if (strM0.equals("battery_temperature")) {
                        b = 6;
                    }
                    break;
                case -1281860764:
                    if (strM0.equals("family")) {
                        b = 7;
                    }
                    break;
                case -1097462182:
                    if (strM0.equals("locale")) {
                        b = 8;
                    }
                    break;
                case -1012222381:
                    if (strM0.equals("online")) {
                        b = 9;
                    }
                    break;
                case -877252910:
                    if (strM0.equals("battery_level")) {
                        b = 10;
                    }
                    break;
                case -619038223:
                    if (strM0.equals("model_id")) {
                        b = 11;
                    }
                    break;
                case -568274923:
                    if (strM0.equals("screen_density")) {
                        b = 12;
                    }
                    break;
                case -417046774:
                    if (strM0.equals("screen_dpi")) {
                        b = 13;
                    }
                    break;
                case -136523212:
                    if (strM0.equals("free_memory")) {
                        b = Dot11LinkAdaptationControl.ASELI;
                    }
                    break;
                case 3355:
                    if (strM0.equals("id")) {
                        b = 15;
                    }
                    break;
                case 3373707:
                    if (strM0.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                        b = 16;
                    }
                    break;
                case 59142220:
                    if (strM0.equals("low_memory")) {
                        b = 17;
                    }
                    break;
                case 93076189:
                    if (strM0.equals("archs")) {
                        b = 18;
                    }
                    break;
                case 93997959:
                    if (strM0.equals("brand")) {
                        b = 19;
                    }
                    break;
                case 104069929:
                    if (strM0.equals("model")) {
                        b = 20;
                    }
                    break;
                case 115746789:
                    if (strM0.equals("cpu_description")) {
                        b = 21;
                    }
                    break;
                case 244497903:
                    if (strM0.equals("processor_frequency")) {
                        b = 22;
                    }
                    break;
                case 731866107:
                    if (strM0.equals("connection_type")) {
                        b = 23;
                    }
                    break;
                case 746402966:
                    if (strM0.equals("chipset")) {
                        b = 24;
                    }
                    break;
                case 817830969:
                    if (strM0.equals("screen_width_pixels")) {
                        b = 25;
                    }
                    break;
                case 823882553:
                    if (strM0.equals("external_storage_size")) {
                        b = 26;
                    }
                    break;
                case 897428293:
                    if (strM0.equals("storage_size")) {
                        b = 27;
                    }
                    break;
                case 1331465768:
                    if (strM0.equals("usable_memory")) {
                        b = 28;
                    }
                    break;
                case 1418777727:
                    if (strM0.equals("memory_size")) {
                        b = 29;
                    }
                    break;
                case 1436115569:
                    if (strM0.equals("charging")) {
                        b = 30;
                    }
                    break;
                case 1450613660:
                    if (strM0.equals("external_free_storage")) {
                        b = 31;
                    }
                    break;
                case 1524159400:
                    if (strM0.equals("free_storage")) {
                        b = 32;
                    }
                    break;
                case 1556284978:
                    if (strM0.equals("screen_height_pixels")) {
                        b = 33;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    gVar.z = h3Var.Q(u0Var);
                    break;
                case 1:
                    if (h3Var.peek() == JsonToken.STRING) {
                        gVar.y = h3Var.v0(u0Var);
                    }
                    break;
                case 2:
                    gVar.l = h3Var.z0();
                    break;
                case 3:
                    gVar.b = h3Var.S();
                    break;
                case 4:
                    gVar.E = h3Var.C();
                    break;
                case 5:
                    gVar.k = (Device$DeviceOrientation) h3Var.M0(u0Var, new a(i));
                    break;
                case 6:
                    gVar.D = h3Var.J0();
                    break;
                case 7:
                    gVar.d = h3Var.S();
                    break;
                case 8:
                    gVar.B = h3Var.S();
                    break;
                case 9:
                    gVar.j = h3Var.z0();
                    break;
                case 10:
                    gVar.h = h3Var.J0();
                    break;
                case 11:
                    gVar.f = h3Var.S();
                    break;
                case 12:
                    gVar.w = h3Var.J0();
                    break;
                case 13:
                    gVar.x = h3Var.C();
                    break;
                case 14:
                    gVar.n = h3Var.L();
                    break;
                case 15:
                    gVar.A = h3Var.S();
                    break;
                case 16:
                    gVar.a = h3Var.S();
                    break;
                case 17:
                    gVar.p = h3Var.z0();
                    break;
                case 18:
                    List list = (List) h3Var.O0();
                    if (list != null) {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        gVar.g = strArr;
                    }
                    break;
                case 19:
                    gVar.c = h3Var.S();
                    break;
                case 20:
                    gVar.e = h3Var.S();
                    break;
                case 21:
                    gVar.G = h3Var.S();
                    break;
                case 22:
                    gVar.F = h3Var.h0();
                    break;
                case 23:
                    gVar.C = h3Var.S();
                    break;
                case 24:
                    gVar.H = h3Var.S();
                    break;
                case 25:
                    gVar.u = h3Var.C();
                    break;
                case 26:
                    gVar.s = h3Var.L();
                    break;
                case 27:
                    gVar.q = h3Var.L();
                    break;
                case 28:
                    gVar.o = h3Var.L();
                    break;
                case 29:
                    gVar.m = h3Var.L();
                    break;
                case 30:
                    gVar.i = h3Var.z0();
                    break;
                case 31:
                    gVar.t = h3Var.L();
                    break;
                case 32:
                    gVar.r = h3Var.L();
                    break;
                case 33:
                    gVar.v = h3Var.C();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    h3Var.H(u0Var, concurrentHashMap, strM0);
                    break;
            }
        }
        gVar.I = concurrentHashMap;
        h3Var.t0();
        return gVar;
    }

    public static j e(h3 h3Var, u0 u0Var) {
        String strM0;
        h3Var.P0();
        String strS = null;
        String strS2 = null;
        String strS3 = null;
        v vVar = null;
        v vVar2 = null;
        String strS4 = null;
        HashMap map = null;
        while (h3Var.peek() == JsonToken.NAME) {
            strM0 = h3Var.m0();
            strM0.getClass();
            switch (strM0) {
                case "associated_event_id":
                    vVar = new v(h3Var.t());
                    break;
                case "replay_id":
                    vVar2 = new v(h3Var.t());
                    break;
                case "url":
                    strS4 = h3Var.S();
                    break;
                case "name":
                    strS3 = h3Var.S();
                    break;
                case "contact_email":
                    strS2 = h3Var.S();
                    break;
                case "message":
                    strS = h3Var.S();
                    break;
                default:
                    if (map == null) {
                        map = new HashMap();
                    }
                    h3Var.H(u0Var, map, strM0);
                    break;
            }
        }
        h3Var.t0();
        if (strS == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
            u0Var.f(SentryLevel.ERROR, "Missing required field \"message\"", illegalStateException);
            throw illegalStateException;
        }
        j jVar = new j(strS);
        jVar.b = strS2;
        jVar.c = strS3;
        jVar.d = vVar;
        jVar.e = vVar2;
        jVar.f = strS4;
        jVar.g = map;
        return jVar;
    }

    public static l f(h3 h3Var, u0 u0Var) {
        String strM0;
        h3Var.P0();
        l lVar = new l();
        ConcurrentHashMap concurrentHashMap = null;
        while (h3Var.peek() == JsonToken.NAME) {
            strM0 = h3Var.m0();
            strM0.getClass();
            switch (strM0) {
                case "npot_support":
                    lVar.i = h3Var.S();
                    break;
                case "vendor_id":
                    lVar.c = h3Var.S();
                    break;
                case "multi_threaded_rendering":
                    lVar.g = h3Var.z0();
                    break;
                case "id":
                    lVar.b = h3Var.C();
                    break;
                case "name":
                    lVar.a = h3Var.S();
                    break;
                case "vendor_name":
                    lVar.d = h3Var.S();
                    break;
                case "version":
                    lVar.h = h3Var.S();
                    break;
                case "api_type":
                    lVar.f = h3Var.S();
                    break;
                case "memory_size":
                    lVar.e = h3Var.C();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    h3Var.H(u0Var, concurrentHashMap, strM0);
                    break;
            }
        }
        lVar.j = concurrentHashMap;
        h3Var.t0();
        return lVar;
    }

    public static p g(h3 h3Var, u0 u0Var) {
        String strM0;
        h3Var.P0();
        p pVar = new p();
        ConcurrentHashMap concurrentHashMap = null;
        while (h3Var.peek() == JsonToken.NAME) {
            strM0 = h3Var.m0();
            strM0.getClass();
            switch (strM0) {
                case "rooted":
                    pVar.f = h3Var.z0();
                    break;
                case "raw_description":
                    pVar.c = h3Var.S();
                    break;
                case "name":
                    pVar.a = h3Var.S();
                    break;
                case "build":
                    pVar.d = h3Var.S();
                    break;
                case "version":
                    pVar.b = h3Var.S();
                    break;
                case "kernel_version":
                    pVar.e = h3Var.S();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    h3Var.H(u0Var, concurrentHashMap, strM0);
                    break;
            }
        }
        pVar.g = concurrentHashMap;
        h3Var.t0();
        return pVar;
    }

    public static IllegalStateException h(u0 u0Var, String str) {
        String strY = o40.y("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strY);
        u0Var.f(SentryLevel.ERROR, strY, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException i(u0 u0Var, String str) {
        String strY = o40.y("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strY);
        u0Var.f(SentryLevel.ERROR, strY, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException j(u0 u0Var, String str) {
        String strY = o40.y("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strY);
        u0Var.f(SentryLevel.ERROR, strY, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*  JADX ERROR: NullPointerException in pass: SwitchBreakVisitor
        java.lang.NullPointerException
        */
    @Override // io.sentry.s1
    public final java.lang.Object a(io.sentry.h3 r36, io.sentry.u0 r37) {
        /*
            Method dump skipped, instruction units count: 4496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.clientreport.a.a(io.sentry.h3, io.sentry.u0):java.lang.Object");
    }
}
