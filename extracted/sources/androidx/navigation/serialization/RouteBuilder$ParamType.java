package androidx.navigation.serialization;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class RouteBuilder$ParamType {
    public static final /* synthetic */ RouteBuilder$ParamType[] a;

    static {
        RouteBuilder$ParamType[] routeBuilder$ParamTypeArr = {new RouteBuilder$ParamType("PATH", 0), new RouteBuilder$ParamType("QUERY", 1)};
        a = routeBuilder$ParamTypeArr;
        a.a(routeBuilder$ParamTypeArr);
    }

    public static RouteBuilder$ParamType valueOf(String str) {
        return (RouteBuilder$ParamType) Enum.valueOf(RouteBuilder$ParamType.class, str);
    }

    public static RouteBuilder$ParamType[] values() {
        return (RouteBuilder$ParamType[]) a.clone();
    }
}
