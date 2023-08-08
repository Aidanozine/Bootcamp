package Book3.chapter5;

public interface ThrowableBall {
    void ThrowBall();
    void CatchBall();
}

interface KickableBall {
    void KickBall();
    void CatchBall();
}

interface PlayableBall extends ThrowableBall, KickableBall {
    void dropBall();
}
