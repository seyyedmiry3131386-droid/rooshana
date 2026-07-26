package ir.mservices.market.pika.receive;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ReceiveState {
    public static final ReceiveState a;
    public static final ReceiveState b;
    public static final ReceiveState c;
    public static final /* synthetic */ ReceiveState[] d;

    static {
        ReceiveState receiveState = new ReceiveState("CANCELED", 0);
        a = receiveState;
        ReceiveState receiveState2 = new ReceiveState("SEND_FAILED", 1);
        b = receiveState2;
        ReceiveState receiveState3 = new ReceiveState("INSTALL_FAILED", 2);
        c = receiveState3;
        ReceiveState[] receiveStateArr = {receiveState, receiveState2, receiveState3};
        d = receiveStateArr;
        kotlin.enums.a.a(receiveStateArr);
    }

    public static ReceiveState valueOf(String str) {
        return (ReceiveState) Enum.valueOf(ReceiveState.class, str);
    }

    public static ReceiveState[] values() {
        return (ReceiveState[]) d.clone();
    }
}
