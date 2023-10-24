public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket,int extraBucket) {
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBucket<0) {
            return -1;
        }
        double area = width*height;
        double buckets = area/areaPerBucket;
        int noOfBuckets = (int) Math.ceil(buckets);
        noOfBuckets = noOfBuckets - extraBucket;
        return noOfBuckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width<=0 || height<=0 || areaPerBucket<=0) {
            return -1;
        }
        double area = width*height;
        double buckets = area/areaPerBucket;
        int noOfBuckets = (int) Math.ceil(buckets);
        return noOfBuckets;
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if(area<=0 || areaPerBucket<=0){
            return -1;
        }
        double buckets = area/areaPerBucket;
        int noOfBuckets = (int) Math.ceil(buckets);
        return noOfBuckets;
    }
}
