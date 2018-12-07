package design_pattern.behavioral.iterator.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIXIAOYE on 2018/11/26.
 */

public class ChannelCollectionImpl implements ChannelCollection {
    private List<Channel> channelList;

    public ChannelCollectionImpl() {
        this.channelList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel c) {
        this.channelList.add(c);
    }

    @Override
    public void removeChannel(Channel c) {
        this.channelList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum typeEnum) {
        return new ChannelIteratorImpl(typeEnum, this.channelList);
    }

    private class ChannelIteratorImpl implements ChannelIterator {
        private ChannelTypeEnum type;
        private List<Channel> channels;
        private int position;

        public ChannelIteratorImpl(ChannelTypeEnum typeEnum, List<Channel> channelList) {
            this.type = typeEnum;
            this.channels = channelList;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel c = channels.get(position);
                if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                    return true;
                } else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position++;
            return c;
        }
    }
}
