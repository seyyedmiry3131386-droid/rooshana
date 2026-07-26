package com.google.android.datatransport.cct.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ClientInfo$ClientType {
    public static final ClientInfo$ClientType a;
    public static final /* synthetic */ ClientInfo$ClientType[] b;

    /* JADX INFO: Fake field, exist only in values array */
    ClientInfo$ClientType EF0;

    static {
        ClientInfo$ClientType clientInfo$ClientType = new ClientInfo$ClientType("UNKNOWN", 0);
        ClientInfo$ClientType clientInfo$ClientType2 = new ClientInfo$ClientType("ANDROID_FIREBASE", 1);
        a = clientInfo$ClientType2;
        b = new ClientInfo$ClientType[]{clientInfo$ClientType, clientInfo$ClientType2};
    }

    public static ClientInfo$ClientType valueOf(String str) {
        return (ClientInfo$ClientType) Enum.valueOf(ClientInfo$ClientType.class, str);
    }

    public static ClientInfo$ClientType[] values() {
        return (ClientInfo$ClientType[]) b.clone();
    }
}
