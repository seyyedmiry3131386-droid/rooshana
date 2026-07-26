package org.pcap4j.core;

import org.pcap4j.core.NativeMappings;
import org.pcap4j.packet.Packet;

/* JADX INFO: loaded from: classes4.dex */
public final class BpfProgram {
    private final String expression;
    private volatile boolean freed = false;
    private final Object lock = new Object();
    private final NativeMappings.bpf_program program;

    public enum BpfCompileMode {
        OPTIMIZE(1),
        NONOPTIMIZE(0);

        private final int value;

        BpfCompileMode(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public BpfProgram(NativeMappings.bpf_program bpf_programVar, String str) {
        this.program = bpf_programVar;
        this.expression = str;
    }

    public boolean applyFilter(Packet packet) {
        return applyFilter(packet.getRawData());
    }

    public void free() {
        if (this.freed) {
            return;
        }
        synchronized (this.lock) {
            try {
                if (this.freed) {
                    return;
                }
                NativeMappings.pcap_freecode(this.program);
                this.freed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getExpression() {
        return this.expression;
    }

    public NativeMappings.bpf_program getProgram() {
        return this.program;
    }

    public boolean isFreed() {
        return this.freed;
    }

    public boolean applyFilter(byte[] bArr) {
        return applyFilter(bArr, bArr.length, bArr.length);
    }

    public boolean applyFilter(byte[] bArr, int i, int i2) {
        synchronized (this.lock) {
            try {
                if (this.freed) {
                    return false;
                }
                NativeMappings.bpf_program bpf_programVar = this.program;
                if (bpf_programVar.bf_insns == null) {
                    bpf_programVar.read();
                }
                return NativeMappings.bpf_filter(this.program.bf_insns, bArr, i, i2) != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
