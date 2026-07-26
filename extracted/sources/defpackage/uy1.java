package defpackage;

import com.sun.jna.ELFAnalyser$ArmAeabiAttributesTag$ParameterType;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public final class uy1 {
    public static final LinkedList d = new LinkedList();
    public static final HashMap e = new HashMap();
    public static final HashMap f = new HashMap();
    public static final uy1 g;
    public final int a;
    public final String b;
    public final ELFAnalyser$ArmAeabiAttributesTag$ParameterType c;

    static {
        ELFAnalyser$ArmAeabiAttributesTag$ParameterType eLFAnalyser$ArmAeabiAttributesTag$ParameterType = ELFAnalyser$ArmAeabiAttributesTag$ParameterType.a;
        a(1, "File", eLFAnalyser$ArmAeabiAttributesTag$ParameterType);
        a(2, "Section", eLFAnalyser$ArmAeabiAttributesTag$ParameterType);
        a(3, "Symbol", eLFAnalyser$ArmAeabiAttributesTag$ParameterType);
        ELFAnalyser$ArmAeabiAttributesTag$ParameterType eLFAnalyser$ArmAeabiAttributesTag$ParameterType2 = ELFAnalyser$ArmAeabiAttributesTag$ParameterType.b;
        a(4, "CPU_raw_name", eLFAnalyser$ArmAeabiAttributesTag$ParameterType2);
        a(5, "CPU_name", eLFAnalyser$ArmAeabiAttributesTag$ParameterType2);
        ELFAnalyser$ArmAeabiAttributesTag$ParameterType eLFAnalyser$ArmAeabiAttributesTag$ParameterType3 = ELFAnalyser$ArmAeabiAttributesTag$ParameterType.c;
        a(6, "CPU_arch", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(7, "CPU_arch_profile", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(8, "ARM_ISA_use", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(9, "THUMB_ISA_use", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(10, "FP_arch", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(11, "WMMX_arch", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(12, "Advanced_SIMD_arch", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(13, "PCS_config", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(14, "ABI_PCS_R9_use", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(15, "ABI_PCS_RW_data", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(16, "ABI_PCS_RO_data", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(17, "ABI_PCS_GOT_use", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(18, "ABI_PCS_wchar_t", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(19, "ABI_FP_rounding", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(20, "ABI_FP_denormal", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(21, "ABI_FP_exceptions", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(22, "ABI_FP_user_exceptions", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(23, "ABI_FP_number_model", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(24, "ABI_align_needed", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(25, "ABI_align8_preserved", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(26, "ABI_enum_size", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(27, "ABI_HardFP_use", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        g = a(28, "ABI_VFP_args", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(29, "ABI_WMMX_args", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(30, "ABI_optimization_goals", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(31, "ABI_FP_optimization_goals", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(32, "compatibility", eLFAnalyser$ArmAeabiAttributesTag$ParameterType2);
        a(34, "CPU_unaligned_access", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(36, "FP_HP_extension", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(38, "ABI_FP_16bit_format", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(42, "MPextension_use", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(44, "DIV_use", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(64, "nodefaults", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(65, "also_compatible_with", eLFAnalyser$ArmAeabiAttributesTag$ParameterType2);
        a(67, "conformance", eLFAnalyser$ArmAeabiAttributesTag$ParameterType2);
        a(66, "T2EE_use", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(68, "Virtualization_use", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
        a(70, "MPextension_use", eLFAnalyser$ArmAeabiAttributesTag$ParameterType3);
    }

    public uy1(int i, String str, ELFAnalyser$ArmAeabiAttributesTag$ParameterType eLFAnalyser$ArmAeabiAttributesTag$ParameterType) {
        this.a = i;
        this.b = str;
        this.c = eLFAnalyser$ArmAeabiAttributesTag$ParameterType;
    }

    public static uy1 a(int i, String str, ELFAnalyser$ArmAeabiAttributesTag$ParameterType eLFAnalyser$ArmAeabiAttributesTag$ParameterType) {
        uy1 uy1Var = new uy1(i, str, eLFAnalyser$ArmAeabiAttributesTag$ParameterType);
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = e;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), uy1Var);
        }
        HashMap map2 = f;
        if (!map2.containsKey(str)) {
            map2.put(str, uy1Var);
        }
        d.add(uy1Var);
        return uy1Var;
    }

    public static uy1 b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = e;
        if (map.containsKey(numValueOf)) {
            return (uy1) map.get(Integer.valueOf(i));
        }
        String strN = rm7.n(i, "Unknown ");
        uy1 uy1VarB = b(i);
        return new uy1(i, strN, uy1VarB == null ? i % 2 == 0 ? ELFAnalyser$ArmAeabiAttributesTag$ParameterType.c : ELFAnalyser$ArmAeabiAttributesTag$ParameterType.b : uy1VarB.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && uy1.class == obj.getClass() && this.a == ((uy1) obj).a;
    }

    public final int hashCode() {
        return 469 + this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(" (");
        return dw1.k(this.a, ")", sb);
    }
}
