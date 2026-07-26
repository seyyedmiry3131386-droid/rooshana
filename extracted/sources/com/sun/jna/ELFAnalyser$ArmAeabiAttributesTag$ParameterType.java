package com.sun.jna;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ELFAnalyser$ArmAeabiAttributesTag$ParameterType {
    public static final ELFAnalyser$ArmAeabiAttributesTag$ParameterType a;
    public static final ELFAnalyser$ArmAeabiAttributesTag$ParameterType b;
    public static final ELFAnalyser$ArmAeabiAttributesTag$ParameterType c;
    public static final /* synthetic */ ELFAnalyser$ArmAeabiAttributesTag$ParameterType[] d;

    static {
        ELFAnalyser$ArmAeabiAttributesTag$ParameterType eLFAnalyser$ArmAeabiAttributesTag$ParameterType = new ELFAnalyser$ArmAeabiAttributesTag$ParameterType("UINT32", 0);
        a = eLFAnalyser$ArmAeabiAttributesTag$ParameterType;
        ELFAnalyser$ArmAeabiAttributesTag$ParameterType eLFAnalyser$ArmAeabiAttributesTag$ParameterType2 = new ELFAnalyser$ArmAeabiAttributesTag$ParameterType("NTBS", 1);
        b = eLFAnalyser$ArmAeabiAttributesTag$ParameterType2;
        ELFAnalyser$ArmAeabiAttributesTag$ParameterType eLFAnalyser$ArmAeabiAttributesTag$ParameterType3 = new ELFAnalyser$ArmAeabiAttributesTag$ParameterType("ULEB128", 2);
        c = eLFAnalyser$ArmAeabiAttributesTag$ParameterType3;
        d = new ELFAnalyser$ArmAeabiAttributesTag$ParameterType[]{eLFAnalyser$ArmAeabiAttributesTag$ParameterType, eLFAnalyser$ArmAeabiAttributesTag$ParameterType2, eLFAnalyser$ArmAeabiAttributesTag$ParameterType3};
    }

    public static ELFAnalyser$ArmAeabiAttributesTag$ParameterType valueOf(String str) {
        return (ELFAnalyser$ArmAeabiAttributesTag$ParameterType) Enum.valueOf(ELFAnalyser$ArmAeabiAttributesTag$ParameterType.class, str);
    }

    public static ELFAnalyser$ArmAeabiAttributesTag$ParameterType[] values() {
        return (ELFAnalyser$ArmAeabiAttributesTag$ParameterType[]) d.clone();
    }
}
