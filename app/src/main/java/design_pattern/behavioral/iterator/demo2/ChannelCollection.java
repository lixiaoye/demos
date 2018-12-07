package design_pattern.behavioral.iterator.demo2;

/**
 * Created by LIXIAOYE on 2018/11/26.
 */

public interface ChannelCollection {
    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    public ChannelIterator iterator(ChannelTypeEnum typeEnum);
}
