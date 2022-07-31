package fix

import trace4cats.Trace
import trace4cats.Span
import trace4cats.kernel.SpanExporter
import trace4cats.QueuedSpanExporter
import trace4cats.model._
import trace4cats.model.AttributeValue.StringValue
import trace4cats.attributes.HostAttributes
import trace4cats.dynamic.HotSwapSpanSampler
import trace4cats.dynamic.HotswapSpanCompleter
import trace4cats.dynamic.HotswapSpanExporter
import trace4cats.SemanticTags
import trace4cats.dynamic.config.SamplerConfig
import trace4cats.log.LogSpanExporter
import trace4cats.filtering.AttributeFilter
import trace4cats.sampling.tail.TailSpanSampler
import trace4cats.sampling.tail.RateTailSpanSampler
import trace4cats.RateSpanSampler
import trace4cats.context.Ask
import trace4cats.optics.Lens
import trace4cats.RefSpanCompleter
import trace4cats.test.ArbitraryInstances
import trace4cats.model.ArbitraryAttributeValues
import trace4cats.meta.PipeTracer
import trace4cats.http4s.server.Http4sResourceKleislis
import trace4cats.http4s.server.syntax._
import trace4cats.http4s.client.ClientTracer
import trace4cats.http4s.client.syntax._
import trace4cats.natchez.conversions.toNatchez._
import trace4cats.natchez.conversions.fromNatchez._
import trace4cats.avro.AvroSpanCompleter
import trace4cats.avro.kafka.AvroKafkaConsumer
import trace4cats.avro.kafka.AvroKafkaSpanExporter
import trace4cats.jaeger.JaegerSpanExporter
import trace4cats.opentelemetry.otlp.OpenTelemetryOtlpGrpcSpanExporter
import trace4cats.opentelemetry.jaeger.OpenTelemetryJaegerSpanCompleter
import trace4cats.stackdriver.StackdriverGrpcSpanCompleter
import trace4cats.stackdriver.oauth.GoogleOAuth
import trace4cats.stackdriver.project.ProjectIdProvider
import trace4cats.datadog.DataDogSpanCompleter
import trace4cats.newrelic.NewRelicSpanExporter
import trace4cats.zipkin.ZipkinHttpSpanCompleter
import trace4cats.kafka.TracedConsumer
import trace4cats.kafka.syntax._

object TraceTests {}