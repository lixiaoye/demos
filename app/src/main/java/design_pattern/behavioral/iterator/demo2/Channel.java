package design_pattern.behavioral.iterator.demo2;


/**
 * Created by LIXIAOYE on 2018/11/26.
 */

public class Channel {
    private double frequency;
    private ChannelTypeEnum TYPE;

    public Channel(double freq, ChannelTypeEnum typeEnum) {
        this.frequency = freq;
        this.TYPE = typeEnum;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", TYPE=" + TYPE +
                '}';
    }
}
