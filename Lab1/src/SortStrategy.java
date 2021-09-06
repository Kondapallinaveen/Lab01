
public interface SortStrategy {

	public long[] sort(long[] popcount);

	public String strategyName();

	public long getSortTime();

}
